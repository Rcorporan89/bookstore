package com.example.Bookstore.service;

import com.example.Bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List <Book> getBooks(){
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(1, "The Alchemist","https://static.toiimg.com/photo/90514385/90514385.jpg?v=3", "The Alchemist is a novel written by Paulo Coelho that tells the story of Santiago, a young shepherd who dreams of finding a treasure. Santiago embarks on a journey from his home in Andalusia, Spain, to the markets of Tangiers, and then across the Sahara desert to the pyramids of Egypt, in search of his treasure. Along the way, he meets a series of characters who teach him valuable life lessons and guide him towards his ultimate destiny. Through Santiago's journey, the novel explores themes of following one's dreams, discovering one's personal legend, and finding meaning and purpose in life.");

        Book book2 = new Book(2, "Don Quijote de la mancha","http://www.psupress.org/images/covers/294wide/978-0-271-08231-8md_294.jpg", "Don Quijote de la Mancha is a novel by Miguel de Cervantes that tells the story of a man named Alonso Quixano who becomes so enamored with stories of chivalry and adventure that he decides to become a knight himself. He dons a suit of armor, renames himself Don Quijote, and sets out on a quest to right wrongs and defend the honor of his lady love, Dulcinea del Toboso. However, his delusions of grandeur and chivalry often lead to comical misadventures and mishaps. The novel is a satirical commentary on the idealism of the chivalric code and the contrast with the reality of 17th century Spain. It has become a classic of Spanish literature and is widely regarded as one of the greatest works of fiction ever written.");
        books.add(book1);
        books.add(book2);
        return books;
    }


}
