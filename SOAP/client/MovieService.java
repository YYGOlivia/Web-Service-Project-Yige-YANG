package com.movie.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.7
 * 2024-04-11T22:02:19.514+02:00
 * Generated source version: 3.5.7
 *
 */
@WebService(targetNamespace = "http://service.movie.com/", name = "MovieService")
@XmlSeeAlso({ObjectFactory.class})
public interface MovieService {

    @WebMethod
    @RequestWrapper(localName = "getMovieRating", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetMovieRating")
    @ResponseWrapper(localName = "getMovieRatingResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetMovieRatingResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getMovieRating(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addMovie", targetNamespace = "http://service.movie.com/", className = "com.movie.client.AddMovie")
    @ResponseWrapper(localName = "addMovieResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.AddMovieResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addMovie(

        @WebParam(name = "arg0", targetNamespace = "")
        com.movie.client.Movie arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getActorsByMovie", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetActorsByMovie")
    @ResponseWrapper(localName = "getActorsByMovieResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetActorsByMovieResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.movie.client.Actor> getActorsByMovie(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "addActor", targetNamespace = "http://service.movie.com/", className = "com.movie.client.AddActor")
    @ResponseWrapper(localName = "addActorResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.AddActorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int addActor(

        @WebParam(name = "arg0", targetNamespace = "")
        com.movie.client.Actor arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getMoviesByActor", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetMoviesByActor")
    @ResponseWrapper(localName = "getMoviesByActorResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetMoviesByActorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.movie.client.Movie> getMoviesByActor(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getMovieByTitle", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetMovieByTitle")
    @ResponseWrapper(localName = "getMovieByTitleResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.GetMovieByTitleResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.movie.client.Movie getMovieByTitle(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "linkMovieToActor", targetNamespace = "http://service.movie.com/", className = "com.movie.client.LinkMovieToActor")
    @ResponseWrapper(localName = "linkMovieToActorResponse", targetNamespace = "http://service.movie.com/", className = "com.movie.client.LinkMovieToActorResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean linkMovieToActor(

        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1
    );
}
