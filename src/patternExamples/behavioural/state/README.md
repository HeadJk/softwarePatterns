Consequences (+)

1. State specific behaviour is localized
Makes it easy to add and remove states
Allows states to be arranged in an inheritance hierarchy to share
common behaviour

2. Avoids conditional branching
Thus simplifying the logic

3. Makes state model explicit
If state information is spread over multiple variables, the state
model is obscured. Consider
deviceEnum currentDevice ; // FM or CD
boolean on ; // Is the current device “on”
The meaning of “on” depends on the value of “currentDevice ”

Consequences (-)

1. Responsibility is spread over more classes.
The context will typically have to expose its internal design to the
state classes.
For simple problems, the State pattern may be over-design.