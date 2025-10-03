package Repository;

import Models.Request;

import java.util.List;

public interface RequestRepository {
    void addRequest(Request request);
    void deleteRequestById(int id);
    Request getRequestById(int id);
    List<Request> getAllRequests();
}
