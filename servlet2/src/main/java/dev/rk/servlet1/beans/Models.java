package dev.rk.servlet1.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Models {

    private List<Item> list;

    public Models() {
        var laptop1 = new Item(1,
                "Lenovo ThinkPad X1 Carbon",
                "https://www.lenovo.com/medias/lenovo-laptops-thinkpad-x1-carbon-gen-10-hero.png?context=bWFzdGVyfHJvb3R8NDk2OTY3fGltYWdlL3BuZ3xoZWQvaDdiLzEzMTM1OTk1NTY4MTU4LnBuZ3xmNGQzMmI4ZTA3M2UyN2YxYjdkMTk2YTk3NmVlNDYyOWFmZGIzYjk4ZjMyNzRmZTQ5ZjE4YTI0YmJmYTI2YTFj",
                "The Lenovo ThinkPad X1 Carbon is a premium business laptop that boasts a sleek and lightweight design. It features an 11th Gen Intel Core processor, a 14-inch display, and up to 16GB of RAM.",
                Arrays.asList(
                        "https://root-nation.com/wp-content/uploads/2020/01/lenovo-thinkpad-x1-carbon-7th-2.jpg",
                        "https://cdn.arstechnica.net/wp-content/uploads/2022/08/IMG_0319.jpeg"
                )
        );
        var laptop2 = new Item( 2,
                "Lenovo Yoga C940",
                "https://www.notebookcheck-ru.com/uploads/tx_nbc2/c94015.jpg",
                "The Lenovo Yoga C940 is a versatile 2-in-1 laptop that can be used as a traditional laptop or as a tablet. It features a 10th Gen Intel Core processor, a 14-inch touchscreen display, and up to 16GB of RAM.",
                Arrays.asList(
                        "https://www.notebookcheck-ru.com/uploads/tx_nbc2/c94014.jpg",
                        "https://www.notebookcheck-ru.com/uploads/tx_nbc2/Bildschirmfoto_2019-09-27_um_09.54.23.png"
                )
        );
        var laptop3 = new Item(3,
                "Lenovo IdeaPad Gaming 3",
                "https://microless.com/cdn/products/76b0dd15d4510ec68746f30a14932e10-hi.jpg",
                "The Lenovo IdeaPad Gaming 3 is a budget gaming laptop that offers impressive performance for its price. It features a 10th Gen Intel Core processor, a 15.6-inch display, and up to 8GB of RAM.",
                Arrays.asList(
                        "https://www.kievmag.com.ua/image/cache/data-26-90-81ad08da87a07d4e24a8eff81b55a44f-600x600.jpg",
                        "https://static.insalescdn.com/r/4b3gETsWnW8/rs:fit:1000:0:1/plain/images/products/1/1971/534259635/Screenshot_2.png"
                )
        );
        list = Arrays.asList(laptop1, laptop2, laptop3);
    }

    public List<Item> getList() {
        return list;
    }

    public Optional<Item> getOne(int id) {
        return  list.stream().filter(i -> i.getId() == id).findFirst();
    }
}
