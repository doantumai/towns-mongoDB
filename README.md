# mongoDB
eine kleine Java-SpringBoot-Applikation, die das Abfragen auf
geschachelten Datenelementen umsetzt.

@Query(value ="{ famousFor : 'food' }", fields = "{ id : 0, name : 1, famousFor : 1, mayor : 1}")
@Query(value ="{ famousFor : {$regex: /MOMA/} }", fields = "{ id : 0, name : 1, famousFor : 1 , mayor : 1}")
@Query(value ="{ famousFor : { $all : ['food', 'beer'] } }", fields = "{ id : 0, name : 1, famousFor : 1}")
@Query(value ="{ famousFor : { $nin : ['food', 'beer'] } }", fields = "{ id : 0, name : 1, famousFor : 1 }")
@Query(value ="{ 'mayor.party' : 'D' }", fields = "{ id : 0, name : 1, mayor : 1 }")
    
