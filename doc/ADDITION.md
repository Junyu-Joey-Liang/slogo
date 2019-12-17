CompSci 308: SLogo Addition
===
name: Junyu Liang (jl751)

# Before

### Estimation

 * How long do you think it will take you to complete this new feature?
 
 20 minutes

 * How many files will you need to add or update? Why?
 
 1. Controller: need to add a new data structure (map) to keep track of the turtleid, turtle orientation, turtle location that is stamped. Also public methods to add and remove stamps.
 2. new Classes that extends TurtleCommandTreeNode for the new commands.

 



# After

### Review

 * How long did it take you to complete this new feature?
 

 10 minutes
 

 * How many files did you need to add or update? Why?
 
 one more file: the resource file for mapping command literals to command tree node classes for reflection
 

 * Did you get it completely right on the first try? If not, why not?

no. I forgot about reflection with the resource file.


### Analysis

 * What do you feel this exercise reveals about your project's design and documentation --- was it as good (or bad) as you remembered?

yes. The design made it really easy to add new commands. You just extend the commandTreeNode class and implement the methods as explained. 
 * What about the design or documentation could be improved?

 * What would it have been like if you were not familiar with the code at all?
 
 I think the overall implementation makes it clear of how the commands are structured. You do not need to know how they are implemented.
 All you need to define is what your command returns. it might be better if the resource files are in a more obvious location though.