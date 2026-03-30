# Development Log

## Instructions
Document your development process as you work on the assignment. Add entries showing:
- What you worked on
- Problems you encountered
- How you solved them
- Time spent

**Requirements**: Minimum 5 entries showing progression over time.

## Your Development Log:

### Entry 1 - [March 28, 2026, 3:00 PM]
**What I did**: Started the assignment and set up the environment

**Details**: 
- Created GitHub account with university email
- Forked the starter repository
- Updated student ID in SchedulerSimulation.java to 444052278
- Tried to compile the starter code to check it runs

**Challenges**: `javac` not recognized in terminal; needed to set up JDK properly

**Solution**: Installed JDK 17 and set PATH variable; tested compilation successfully

**Time spent**: 1 hour


### Entry 2 - [March 29, 2026, 2:00 PM]
**What I did**: Implemented Feature 1: Process Priority

**Details**: 
- Added `priority` field to `Process` class (values 1-5)
- Generated random priorities when creating processes
- Displayed priority when a process enters the ready queue

**Challenges**: Output alignment was messy, especially with colors and progress bars

**Solution**: Experimented with ANSI color codes and formatted strings until output was clean

**Time spent**: 2.5 hours

---

### Entry 3 - [March 30, 2026, 10:30 AM]
**What I did**: Implemented Feature 2: Context Switch Counter

**Details**: 
- Added static counter variable for context switches
- Incremented counter whenever a process starts running
- Displayed total context switches at the end of the simulation

**Challenges**: Sometimes counter incremented incorrectly when last process ran

**Solution**: Moved increment logic carefully inside the main scheduling loop before `Thread.start()`

**Time spent**: 2 hours


### Entry 4 - [March 30, 2026, 1:00 PM]
**What I did**: Implemented Feature 3: Waiting Time Tracking

**Details**: 
- Added `creationTime` and `waitingTime` fields in `Process` class
- Calculated waiting time using `System.currentTimeMillis()`
- Displayed summary table with Process Name, Burst Time, Waiting Time at the end

**Challenges**: 
- Hard to track waiting time accurately across multiple context switches
- Needed to ensure time between each quantum is counted

**Solution**: Updated `lastExecutionTime` after each quantum and accumulated waiting time correctly

**Time spent**: 3 hours


### Entry 5 - [March 30, 2026, 5:00 PM]
**What I did**: Full simulation testing

**Details**: 
- Ran several test cases with different numbers of processes and time quanta
- Verified that priorities, context switches, and waiting times were correct
- Fixed small display issues with progress bars and queue printing

**Challenges**: Some processes were not re-queued properly; waiting time calculations off in first tests

**Solution**: Adjusted logic for re-queuing and waiting time accumulation

**Time spent**: 3.5 hours

---

### Entry 6 - [March 30, 2026, 8:00 PM]
**What I did**: Added final comments and cleaned code formatting

**Details**: 
- Added comments for each feature explaining purpose and logic
- Ensured code runs without errors
- Checked output for readability

**Challenges**: Time-consuming to make output visually neat and readable

**Solution**: Tested multiple runs and adjusted spacing and colors

**Time spent**: 2 hours

---

## Summary

**Total time spent on assignment**: ~14 hours

**Most challenging part**: Tracking waiting time accurately for each process while maintaining correct context switch count

**Most interesting learning**: Realized how Round-Robin scheduling works in practice, and how multithreading affects process timing, context switches, and fairness
