package dev.rk.servlet1.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class News {

    private List<Item> list;

    public News() {
        var news1 = new Item(1,
                "Lenovo Launches Next-Gen Laptops with 11th Gen Intel Core Processors and New Display Technologies",
                "https://static.lenovo.com/ww/img/new-homepage/default/lenovo-pcs-tablets-hover.jpg",
                "Create title: Lenovo unveils its latest line of laptops with 11th Gen Intel Core processors: In January 2023, Lenovo announced the launch of its latest line of laptops, including the ThinkPad X1 Carbon, Yoga Slim 9i, and IdeaPad Slim 7 Carbon, all featuring 11th Gen Intel Core processors and new display technologies.",
                Arrays.asList("https://www.lenovo.com/medias/lenovo-laptop-yoga-2-in-1-series-feature-2.jpg?context=bWFzdGVyfHJvb3R8Njk5NDE5fGltYWdlL2pwZ3xoMjIvaGI3LzExMDI4NjczODIyNzUwLmpwZ3wxODZjNzY0YmUxMWYyY2Y4NWQ3MmJhZTUyNmVlMzg1NjZkMDgxNDA3Mzg0YTI3NDQ5ODNmZTFkOTMzN2U2NzRl", "https://images.firstpost.com/wp-content/uploads/2019/12/lenovo-logo1.jpg")
        );
        var news2 = new Item( 2,
                "Lenovo Emerges as World's Largest PC Maker with 25.1% Market Share, Overtaking HP in July 2022",
                "https://www.lenovo.com/medias/lenovo-laptop-yoga-2-in-1-series-feature-2.jpg?context=bWFzdGVyfHJvb3R8Njk5NDE5fGltYWdlL2pwZ3xoMjIvaGI3LzExMDI4NjczODIyNzUwLmpwZ3wxODZjNzY0YmUxMWYyY2Y4NWQ3MmJhZTUyNmVlMzg1NjZkMDgxNDA3Mzg0YTI3NDQ5ODNmZTFkOTMzN2U2NzRl",
                "Lenovo becomes the world's top PC maker: In July 2022, Lenovo overtook HP as the world's largest personal computer maker, with a market share of 25.1%, according to research firm Gartner. Lenovo's strong performance was attributed to its focus on innovation and expanding its product portfolio.",
                Arrays.asList("https://images.firstpost.com/wp-content/uploads/2019/12/lenovo-logo1.jpg", "https://static.lenovo.com/ww/img/new-homepage/default/lenovo-pcs-tablets-hover.jpg")
        );
        var news3 = new Item(3,
                "Lenovo Collaborates with Amazon Web Services to Boost Cloud Services with Enhanced Security and Comprehensive Experience",
                "https://images.firstpost.com/wp-content/uploads/2019/12/lenovo-logo1.jpg",
                "Lenovo partners with Amazon Web Services to enhance cloud services: In May 2022, Lenovo announced a strategic partnership with Amazon Web Services (AWS) to integrate AWS services into Lenovo's cloud infrastructure. The partnership aimed to enhance Lenovo's cloud services and provide customers with a more comprehensive and secure cloud computing experience.",
                Arrays.asList("https://www.lenovo.com/medias/lenovo-laptop-yoga-2-in-1-series-feature-2.jpg?context=bWFzdGVyfHJvb3R8Njk5NDE5fGltYWdlL2pwZ3xoMjIvaGI3LzExMDI4NjczODIyNzUwLmpwZ3wxODZjNzY0YmUxMWYyY2Y4NWQ3MmJhZTUyNmVlMzg1NjZkMDgxNDA3Mzg0YTI3NDQ5ODNmZTFkOTMzN2U2NzRl", "https://static.lenovo.com/ww/img/new-homepage/default/lenovo-pcs-tablets-hover.jpg")
        );
        list = Arrays.asList(news1, news2, news3);
    }

    public List<Item> getList() {
        return list;
    }

    public Optional<Item> getOne(int id) {
        return  list.stream().filter(i -> i.getId() == id).findFirst();
    }
}
