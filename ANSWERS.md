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

[Write your answer here. For each state, explain when P1 enters that state during the simulation. Use your understanding of the code to trace through the lifecycle.]

1. **New**: [When is P1 in New state?]

2. **Runnable**: [When does P1 become Runnable?]

3. **Running**: [When is P1 Running?]

4. **Waiting**: [When/why would P1 be Waiting?]

5. **Terminated**: [When is P1 Terminated?]

---

## Question 4: Real-World Applications

**Question**: Give **TWO** real-world examples where Round-Robin scheduling with threads would be useful. Explain why this scheduling algorithm works well for those scenarios.

**Your Answer:**

### Example 1: [Name of application/scenario]

**Description**: 
[Describe the real-world scenario or application]

**Why Round-Robin works well here**: 
[Explain why Round-Robin scheduling is suitable. Consider fairness, responsiveness, predictability, etc.]

### Example 2: [Name of application/scenario]

**Description**: 
[Describe the real-world scenario or application]

**Why Round-Robin works well here**: 
[Explain why Round-Robin scheduling is suitable. Consider fairness, responsiveness, predictability, etc.]

---

## Summary

**Key concepts I understood through these questions:**
1. 
2. 
3. 

**Concepts I need to study more:**
1. 
2. 
