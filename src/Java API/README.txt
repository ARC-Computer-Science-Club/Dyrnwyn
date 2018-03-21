I heavily changed the CommandToMove.java and Beaver.java to accomodate the
Commander.java.

The reason being is that when the beavers were printing out their commands into
moveCommand.txt, I noticed that each beaver had thier commands grouped with
their ID. So the previous output before the new commit on 3/20 was...

^0NULL                                      ^0NULL
<0NULL                                      ^1NULL
>0NULL                                      <0NULL
#0NULL                                      <1NULL
+0NULL          Not Like --->               >0NULL
^1NULL                                      >1NULL
<1NULL                                      #0NULL
>1NULL                                      #1NULL
#1NULL                                      +0NULL
+1NULL                                      +1NULL

Because I had each method call as...

beaver0.forward();
beaver1.forward();

beaver0.turnLeft();
beaver1.turnLeft();

beaver0.turnRight();
beaver1.turnRight();

beaver0.buildDam();
beaver1.buildDam();

beaver0.gather();
beaver1.gather();

Also, if you put the one of the beaver's ID to NULL, then you get this output...

^਀<਀>਀#਀+਀Ş਀ļ਀ľ਀ģ਀ī਀ɞ਀ȼ਀Ⱦ਀ȣ਀ȫ਀͞਀̼਀̾਀̣਀̫਀ў਀м਀о਀У਀Ы਀

So I Thought maybe I need a super class that concatenates each of the beaver's
commands into one string so the FileWriter can output the correct ordering.
But that proved to be hard as well since I noticed that whenever I tried to
concatenate the commands, the output would ignore all beaver commands.

Ex.

beaver0.forward();                              (nothing)
beaver1.forward();                              
                        would look like ->
beaver0.forward();
beaver1.forward();

I figured out that each Beaver Subclass apparently inherets its own Super class
and since they inhereit their own Super class, they can't communicate to each
other on what command does what first and who's command does it belong to.
So later, very much later, I figured out how that in order for the two, or
multiple, beavers to talk to each other, I need a class that can listen to
every beaver that's under it, and so the Commander Class came to be. The only
downside to this apporach is that every Beaver needs to have some sort of
Commander they are under or else they won't work. Another small problem is 
that the Commander has the power to end the conversation of the beavers so no
more commands can't be printed. Although, I think this is a good thing as well
since closing the file isn't "external" (I mean as in that we don't have to
write out "writer.close()" explicitly, but we tell the commander to write out
the orders to "moveCommand.txt") and it ONLY gives the Commander the power to
stop writing down commands instead of the beavers. 

Ex.

. beaver0 tells Commander that it wants to do forward()
. Commander adds beaver0's command to the list
. beaver1 tells Commander that it wants to do forward() as well
. Commander adds beaver1's command at the end of the list (after beaver0's)
. (You then can see where we're going from here)
. Finally, the Commander writes down the commands to "moveCommand.txt"

So now "moveCommand.txt" shows us...

^0NULL
^1NULL
^2NULL
^3NULL
.
.
.
(and etc if we keep ordering each beaver to sequentially go forward)

The Commander is probably the only way how the beavers need to talk to each
other because I don't know what else that would make this more easier and/or
better.