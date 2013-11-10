package org.acme.groovy

class Song {
     def name
     String artist
     def genre
     
     def getGenre(){
         genre?.toUpperCase()
     }
     
     String toString(){
      "${name}, ${artist}, ${getGenre()}"
     }
}