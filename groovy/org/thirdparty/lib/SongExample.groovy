package org.thirdparty.lib

import org.acme.groovy.Song

class SongExample {

    static main(args) {
        def sng = new Song(name:"Le Freak",
            artist:"Chic", genre:"Disco");
        
        def sng2 = new Song(name:"Kung Fu Fighting", genre:"Disco");
        
        def sng3 = new Song()
        sng3.name = "Funkytown"
        sng3.artist = "Lipps Inc."
        sng3.setGenre("Disco")
                
        assert sng3.getArtist() == "Lipps Inc."
        
        sng3.setGenre "Disco"
//        assert sng3.genre == "Disco"
        
        println sng3
        println sng2.artist?.toUpperCase()
        
        def sng4 = new Song(name:"Thriller", artist:"Michael Jackson")
        println sng4
        
        
        
    }

}
