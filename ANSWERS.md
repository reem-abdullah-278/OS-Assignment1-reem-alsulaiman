# Assignment Questions

## Instructions
Answer all 4 questions with detailed explanations. Each answer should be **3-5 sentences minimum** and demonstrate your understanding of the concepts.

---

## Question 1: Thread vs Process

**Question**: Explain the difference between a **thread** and a **process**. Why did we use threads in this assignment instead of creating separate processes?

**Your Answer:**


A process is an independent program that runs in its own memory space, while a thread is a smaller unit of execution within a process that shares the same memory and resources. Threads are lighter than processes and have lower creation overhead, making them faster to start and manage. In this assignment, we used threads because all processes share common data like the ready queue and context switch counter. Using separate processes would require complex inter-process communication and more system resources. Threads also allow us to simulate concurrent execution efficiently within a single program.

---

## Question 2: Ready Queue Behavior

**Question**: In Round-Robin scheduling, what happens when a process doesn't finish within its time quantum? Explain using an example from your program output.

**Your Answer:**

In Round-Robin scheduling, if a process does not finish within its time quantum, it is re-queued at the end of the ready queue to wait for its next turn. This ensures fairness, so no single process can monopolize the CPU. For example, in my simulation, P1 ran for 5000 ms but still had 1052 ms remaining. Therefore, P1 was added back to the ready queue to continue execution later. This behavior guarantees that all processes get a chance to run regularly without starvation

Example from my output:
```
[Running P1 (Priority: 2) for 5000 ms
P1 remaining time: 1052
P1 (Priority: 2) added to queue]
```

**Explanation of example:**
P1 did not finish in its time quantum, so it was placed back in the ready queue. When its turn comes again, it continues executing until completion.

---

## Question 3: Thread States

**Question**: A thread can be in different states: **New**, **Runnable**, **Running**, **Waiting**, **Terminated**. Walk through these states for one process (P1) from your simulation.

**Your Answer:**
The lifecycle of a thread goes through several states:

New: P1 is in the New state when the thread object is created but before Thread.start() is called.
Runnable: P1 becomes Runnable after Thread.start() is called, waiting for the CPU scheduler to allocate time.
Running: P1 enters Running when the CPU executes its run() method during its time quantum.
Waiting: P1 can be in Waiting when it finishes its current time quantum and waits in the ready queue for the next turn.
Terminated: P1 reaches Terminated once it finishes execution and exits the run() method.

This simulation clearly demonstrates how threads transition between these states while executing Round-Robin scheduling.

---

## Question 4: Real-World Applications

**Question**: Give **TWO** real-world examples where Round-Robin scheduling with threads would be useful. Explain why this scheduling algorithm works well for those scenarios.

**Your Answer:**
Example 1: Web server handling multiple client requests
Description: A web server must respond to many users simultaneously. Each request can be handled by a thread.
Why Round-Robin works well here: It ensures all client requests are treated fairly, and no request is starved. Threads make handling multiple requests efficient because they share memory for common resources like logs or caches.

Example 2: Multimedia player (video/audio streaming)
Description: A media player processes audio, video, and UI interactions concurrently. Each task runs on a separate thread.
Why Round-Robin works well here: It allows all tasks to get CPU time fairly, keeping video, audio, and interface responsive without lag. This predictable scheduling improves user experience and prevents any one task from blocking others.

---

## Summary
Key concepts I understood through these questions:

Differences between threads and processes, and why threads are efficient for simulation.
How Round-Robin scheduling manages fairness through re-queuing processes.
Thread lifecycle states and their transitions during execution.

Concepts I need to study more:

Advanced synchronization techniques to prevent race conditions.
Measuring and optimizing thread performance in real-world systems.
