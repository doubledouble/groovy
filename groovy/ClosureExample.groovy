
class ClosureExample {

    static main(args) {
        def excite = { word ->
         return "${word}!!"
        }
        assert "Groovy!!" == excite("Groovy")
        assert "Java!!" == excite.call("Java")
    }

}
