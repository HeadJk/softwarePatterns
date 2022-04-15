Consequences (+)

1. ConcreteSubject may be reused without
reusing observers

2. Observer classes may be added or removed
without modifying ConcreteSubject or other
observer classes.

3. Observers may belong to higher level in a
layered system.

4. Supports broadcast to many observers

Consequences (-)

1. Cost of update is hidden from subject.

2. No indication of how subject has changed, may lead
to costly unneeded updates. (Not usually a problem
in GUIs.)

3. Subject must be consistent when it calls
notifyObservers.

4. Observer must be consistent if it calls setState.

5. Too many notifications. If every change causes
notifications, this may be too many.
