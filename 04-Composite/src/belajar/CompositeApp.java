package belajar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeApp {
    public static void main(String[] args) {
        List<Category> categories = Arrays.asList(
          new CompositeCategory("Handphone", Arrays.asList(
                  new Category("Android"),
                  new CompositeCategory("IOS", Arrays.asList(
                      new Category("Apple Iphone 5"),
                      new Category("Apple Iphone 5s"),
                      new Category("Apple Iphone 6"),
                      new Category("Apple Iphone 6s"),
                      new Category("Apple Iphone 6s+"),
                      new Category("Apple Iphone 7"),
                      new Category("Apple Iphone 7+"),
                      new Category("Apple Iphone 8"),
                      new Category("Apple Iphone 8+"),
                      new Category("Apple Iphone 11"),
                      new Category("Apple Iphone XI"),
                      new Category("Apple Iphone XI Pro"),
                      new Category("Apple Iphone XII Pro Max"),
                      new Category("Apple Iphone X"),
                      new Category("Apple Iphone Xs"),
                      new Category("Apple Iphone Xs Max")
                  ))
          )),
          new CompositeCategory("Computer",Arrays.asList(
                  new Category("Laptop"),
                  new Category("PC")
          )),
          new Category("Fashion")
        );

        categories.forEach(category -> {
           printCategory(category);
        });
    }
    private static void printCategory(Category category){
        System.out.println(category.getName());
        if(category instanceof CompositeCategory){
            CompositeCategory compositeCategory = (CompositeCategory) category;
            compositeCategory.getCategories().forEach(value -> {
                System.out.print("  ");
                printCategory(value);
            });
        }
    }
}
