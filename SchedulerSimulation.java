import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

class Process implements Runnable {
private String name;
private int burstTime;
private int timeQuantum;
private int remainingTime;
private int priority;

private long creationTime;
private long waitingTime;
private long lastExecutionTime;

public Process(String name, int burstTime, int timeQuantum, int priority) {
this.name = name;
this.burstTime = burstTime;
this.timeQuantum = timeQuantum;
this.remainingTime = burstTime;
this.priority = priority;

this.creationTime = System.currentTimeMillis();
this.waitingTime = 0;
this.lastExecutionTime = creationTime;
}

@Override
public void run() {
int runTime = Math.min(timeQuantum, remainingTime);

System.out.println("Running " + name + " (Priority: " + priority + ") for " + runTime + " ms");

try {
Thread.sleep(runTime);
} catch (InterruptedException e) {
System.out.println(name + " interrupted");
}

remainingTime -= runTime;

if (remainingTime <= 0) {
System.out.println(name + " finished execution");
} else {
System.out.println(name + " remaining time: " + remainingTime);
}
}

public void runToCompletion() {
try {
Thread.sleep(remainingTime);
remainingTime = 0;
System.out.println(name + " finished execution");
} catch (InterruptedException e) {
System.out.println(name + " interrupted");
}
}

public String getName() { return name; }
public int getBurstTime() { return burstTime; }
public int getRemainingTime() { return remainingTime; }
public boolean isFinished() { return remainingTime <= 0; }
public int getPriority() { return priority; }

public void addWaitingTime(long time) { this.waitingTime += time; }
public long getWaitingTime() { return waitingTime; }
public long getLastExecutionTime() { return lastExecutionTime; }
public void setLastExecutionTime(long time) { this.lastExecutionTime = time; }
}

public class SchedulerSimulation {

static int contextSwitchCount = 0;

public static void main(String[] args) {

int studentID = 444052278;
Random random = new Random(studentID);

int timeQuantum = 2000 + random.nextInt(4) * 1000;
int numProcesses = 10 + random.nextInt(11);

Queue<Thread> processQueue = new LinkedList<>();
Map<Thread, Process> processMap = new HashMap<>();
List<Process> allProcesses = new ArrayList<>(); 

// Create processes
for (int i = 1; i <= numProcesses; i++) {
int burstTime = timeQuantum/2 + random.nextInt(2 * timeQuantum + 1);
int priority = random.nextInt(5) + 1;

Process process = new Process("P" + i, burstTime, timeQuantum, priority);

allProcesses.add(process); 

addProcessToQueue(process, processQueue, processMap);
}

// Scheduler loop
while (!processQueue.isEmpty()) {

Thread currentThread = processQueue.poll();
Process process = processMap.get(currentThread);

contextSwitchCount++; 

currentThread.start();
try {
currentThread.join();
} catch (InterruptedException e) {}

if (!process.isFinished()) {

if (!processQueue.isEmpty()) {

long now = System.currentTimeMillis();
long waited = now - process.getLastExecutionTime();

process.addWaitingTime(waited);
process.setLastExecutionTime(now);

addProcessToQueue(process, processQueue, processMap);

} else {
process.runToCompletion();
}
}
}

// Context switches
System.out.println("\nTotal context switches: " + contextSwitchCount);


System.out.println("\nProcess Summary");
System.out.printf("%-10s %-15s %-15s%n", "Process", "Burst Time", "Waiting Time");

for (Process p : allProcesses) {
System.out.printf("%-10s %-15d %-15d%n",
p.getName(),
p.getBurstTime(),
p.getWaitingTime());
}
}

public static void addProcessToQueue(Process process, Queue<Thread> processQueue, Map<Thread, Process> processMap) {

Thread thread = new Thread(process);
processQueue.add(thread);
processMap.put(thread, process);

System.out.println(process.getName() +
" (Priority: " + process.getPriority() + ") added to queue");
}
}
