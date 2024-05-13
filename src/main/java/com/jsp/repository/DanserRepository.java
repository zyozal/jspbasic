package com.jsp.repository;

import com.jsp.entity.Dancer;

import java.util.List;

public interface DanserRepository {

    boolean save(Dancer dancer);

    List<Dancer> retrieve();


}
