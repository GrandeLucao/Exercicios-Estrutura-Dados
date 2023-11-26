package ListaOrdenacao.Ex3;

import java.util.*;

public class Graph<T> {

    private Map<Vertex<T>, List<Edge<T>>> ajdList;

    Graph(){
        this.ajdList=new HashMap<>();
    } 

    void addVertex(Vertex<T> vertex){
        ajdList.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(Vertex<T> source, Vertex<T> destination, int weight){
        ajdList.computeIfAbsent(source, k->new ArrayList<>()).add(new Edge<>(source,destination,weight));
        ajdList.computeIfAbsent(destination, k->new ArrayList<>()).add(new Edge<>(destination,source,weight));
    }

    List<Edge<T>> getEdges(Vertex<T> vertex){
        return ajdList.getOrDefault(vertex, Collections.emptyList());
    }

    Set<Vertex<T>> getVerts(){
        return ajdList.keySet();
    }



}

class Vertex<T>{
    T data;

    Vertex (T data){
        this.data=data;
    }
}


class Edge<T>{
    Vertex<T> source;
    Vertex<T> destination;
    int weight;
    Edge(Vertex<T> source,Vertex<T> destination, int weight){
        this.source=source;
        this.destination=destination;
        this.weight=weight;
    }
}
