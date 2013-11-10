
class Ranger {

    static main(args) {
        def range = 0..4
        println range.class
        assert range instanceof List
        
        
        def coll = ["Groovy", "Java", "Ruby"]
        assert  coll instanceof Collection
        assert coll instanceof ArrayList
        coll.add("Python")
        coll << "Smalltalk"
        coll[5] = "Perl"
        println coll
        
        def numbers = [1,2,3,4]
        assert numbers + 5 == [1,2,3,4,5]
        assert numbers - [2,3] == [1,4]
        
        numbers = [1,2,3,4]
        assert numbers.join(",") == "1,2,3,4"
        assert [1,2,3,4,3].count(3) == 2
        
        assert ["JAVA", "GROOVY"] ==
        ["Java", "Groovy"]*.toUpperCase()
        
        def hash = [name:"Andy", "VPN-#":45]
        assert hash.getClass() == java.util.LinkedHashMap
        hash.put("id", 23)
        assert hash.get("name") == "Andy"
        hash.dob = "01/29/76"
        assert hash.dob == "01/29/76"
        assert hash["name"] == "Andy"
        hash["gender"] = "male"
        assert hash.gender == "male"
        assert hash["gender"] == "male"
        
        
        def acoll = ["Groovy", "Java", "Ruby"]
        acoll.each{
         println it
        }
        acoll.each{ value ->
            println value
        }
        
        hash.each{ key, value ->
            println "${key} : ${value}"
        }
    }

}
