# mongoDB
eine kleine Java-SpringBoot-Applikation, die das Abfragen auf
geschachelten Datenelementen umsetzt.

1. @Query(value ="{ famousFor : 'food' }", fields = "{ id : 0, name : 1, famousFor : 1, mayor : 1}")
2. @Query(value ="{ famousFor : {$regex: /MOMA/} }", fields = "{ id : 0, name : 1, famousFor : 1 , mayor : 1}")
3. @Query(value ="{ famousFor : { $all : ['food', 'beer'] } }", fields = "{ id : 0, name : 1, famousFor : 1}")
4. @Query(value ="{ famousFor : { $nin : ['food', 'beer'] } }", fields = "{ id : 0, name : 1, famousFor : 1 }")
5. @Query(value ="{ 'mayor.party' : 'D' }", fields = "{ id : 0, name : 1, mayor : 1 }")
    
