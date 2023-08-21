Raft is a consensus algorithm designed as an alternative to the Paxos family of algorithms. It was meant to be more understandable than Paxos by means of separation of logic, but it is also formally proven safe and offers some additional features.
Raft offers a generic way to distribute a state machine across a cluster of computing systems, ensuring that each node in the cluster agrees upon the same series of state transitions. 

Raft is a consensus algorithm. It allows the members of a distributed system to agree on a sequence of values in the presence of failures. More specifically, it has become the protocol of choice for building resilient, strongly-consistent distributed systems.

Linearizability is one of the strongest single-key consistency models. It implies that every operation appears to take place atomically and in some total linear order. This means it’s consistent with the real-time ordering of those operations. In other words, the following should be true of operations on a single key:
Operations can execute concurrently, but the state of the database at any point in time must appear to be the result of some ordered, sequential execution of operations.
If operation A completes before operation B begins, then B should logically take effect after A.

