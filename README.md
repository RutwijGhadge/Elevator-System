# Elevator System (LLD)

# 📌 Problem Statement – Elevator System (LLD)
Design an Elevator Control System for a building with multiple elevators.
# 🎯 Requirements
1. System Scope
    * The building has N floors and M elevators.
    * Each elevator can serve any floor.
    * The system must handle user requests efficiently.
2. User Requests
    * A user can request an elevator from outside (hall call):
        * Press Up or Down button on a floor.
    * A user can request a destination from inside the elevator (car call):
        * Select a floor number from the control panel.
3. Elevator Behavior
    * Elevator should respond to requests based on some scheduling logic (e.g., nearest car algorithm).
    * Elevator can move up, down, or stay idle.
    * Door opens when elevator reaches the requested floor.
    * Multiple requests should be queued and processed.
4. Scheduling & Dispatch
    * Decide which elevator should serve a hall call when multiple are available.
    * Optimize for minimum waiting time and fairness.
5. Failure Handling (optional/advanced)
    * If an elevator goes out of service, system should redistribute requests.
    * Handle overload condition (too many passengers).
6. Constraints
    * Assume real-time operation: requests can come anytime.
    * Each elevator has a maximum capacity.
    * The system must ensure safety (e.g., door does not close when obstructed).


# 🧩 System Flow Summary
   * Button Pressed
     * → ButtonService calls 
      RequestService.createPickupRequest() / RequestService.createDropOffRequest()
   * Request Created
     * → Added to RequestRepository (Status PENDING).
   * Scheduler Invoked
     * → Picks best elevator (SchedulerService).
     * Elevator Moves
       * → ElevatorService updates elevator position.
     * Trigger movement/lifecycle updates.
       * → Update Request Status from Pending → Complete → Delete.