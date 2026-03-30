# Reflection Questions

## Instructions
Answer the following questions about your learning experience. Each answer should be **at least 5-7 sentences** and show your understanding.

---

## Question 1: What did you learn about multithreading?

**Your Answer:**


During this assignment, I learned a lot about multithreading in Java. I understood how to create threads using the Runnable interface and how threads can run concurrently to simulate multiple processes. I also learned about thread states like New, Runnable, Running, and Terminated, and how methods like start(), sleep(), and join() affect these states. One thing that surprised me was how threads share memory but still have their own execution flow, which makes managing shared data tricky. I also realized that even with simple code, scheduling threads correctly can be challenging, especially when implementing the Round-Robin algorithm with priorities and context switching.

---

## Question 2: What was the most challenging part of this assignment?

**Your Answer:**


The most challenging part of this assignment was tracking the waiting time for each process while also managing the Round-Robin scheduling correctly. Initially, I struggled with calculating the time each process spends waiting, because I had to carefully consider when a process yields and when it gets CPU again. Another difficult part was ensuring the priority field was displayed correctly and integrated with the ready queue without breaking the existing functionality. Overall, combining multithreading, timing, and queue management made the assignment much harder than I expected.
---

## Question 3: How did you overcome the challenges you faced?

**Your Answer:**

I overcame these challenges by breaking the problem into smaller steps. First, I made sure the Round-Robin scheduling worked without priority or waiting time. Then, I added the priority field and displayed it whenever a process entered the ready queue. For waiting time, I used System.currentTimeMillis() to track when processes start waiting and when they resume execution. I also tested each feature separately before combining them. Reading Java documentation, experimenting in VS Code, and debugging step by step helped me solve most of the problems. It took time, patience, and a lot of trial and error.
---

## Question 4: How can you apply multithreading concepts in real-world applications?

**Your Answer:**

Multithreading is very useful in real-world applications where multiple tasks need to run at the same time. For example, in a web server, each incoming request can be handled by a separate thread, which makes the server responsive to many users simultaneously. Another example is in games, where rendering graphics and processing user input run on different threads to ensure smooth gameplay. This assignment helped me see why thread scheduling, priorities, and context switching are important to make applications efficient and fair. The concepts I learned here, like managing the ready queue and time quantum, directly relate to designing responsive and reliable software.

---

## Additional Reflections (Optional)

### What would you like to learn more about?

[Any topics related to threading, concurrency, or operating systems that you're curious about?]

---

### How confident do you feel about multithreading concepts now?

[Rate yourself and explain: Beginner / Intermediate / Confident]

[Explain your rating - what do you understand well? What needs more practice?]

---

### Feedback on the assignment

[Any comments about the assignment? Was it helpful? Too easy/hard? Suggestions for improvement?]
