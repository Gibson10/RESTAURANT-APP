package com.chrisandgib.afghani23.connection.callbacks;

import com.chrisandgib.afghani23.model.Category;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CallbackCategory implements Serializable {

    public String status = "";
    public List<Category> categories = new ArrayList<>();

}
