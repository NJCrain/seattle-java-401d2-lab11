package com.njcrain.lab11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlbumsController {
    @RequestMapping(value="/albums", method= RequestMethod.GET)
    public String index(Model m) {
        Album[] albums = new Album[]{
                new Album("Trench", "Twenty One Pilots", 14, 2520, "https://upload.wikimedia.org/wikipedia/en/thumb/e/ef/TOP_Trench_Album_Cover.jpg/220px-TOP_Trench_Album_Cover.jpg"),
                new Album("Led Zeppelin IV", "Led Zeppelin", 8, 2880, "https://upload.wikimedia.org/wikipedia/en/thumb/2/26/Led_Zeppelin_-_Led_Zeppelin_IV.jpg/220px-Led_Zeppelin_-_Led_Zeppelin_IV.jpg")
        };

        m.addAttribute("albums", albums);
        return "albums";
    }
}
