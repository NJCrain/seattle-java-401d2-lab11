package com.njcrain.lab11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumsController {
    @Autowired
    private AlbumRepository albumRepo;

    //Gets all albums from the database to render on the page
    @RequestMapping(value="/albums", method= RequestMethod.GET)
    public String index(Model m) {
        m.addAttribute("albums", albumRepo.findAll());
        return "albums";
    }

    //Adds a new album to the database
    @RequestMapping(value="/albums", method= RequestMethod.POST)
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int songCount,
            @RequestParam int length,
            @RequestParam String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }
}
