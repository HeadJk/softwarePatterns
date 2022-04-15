Consequences (+)

1. Client code can create objects of any of a variety
of classes without depending on any of those
classes. Hence it is generic and reusable.

2. Connects parallel class hierarchies (e.g. the
Collection hierarchy and the Iterator hierarchy; e.g.
the TyNode hierarchy and the AbstractDatum
hierarchy).

3. Whether or not an object is created can be
hidden from client. E.g. creator could return a
previously created object. (Consider immutable
objects)