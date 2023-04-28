package org.howard.edu.lsp.exam.problem;

import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SongsDatabaseTest {
    @Test
    public void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        assertEquals(2, db.getSongs("Rap").size());
        assertTrue(db.getSongs("Rap").contains("Savage"));
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
    }

    @Test
    public void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue(jazzSongs.contains("Always There"));

        Set<String> emptySet = db.getSongs("Nonexistent Genre");
        assertTrue(emptySet.isEmpty());
    }

    @Test
    public void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Rap", db.getGenreOfSong("Gin and Juice"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));

        assertNull(db.getGenreOfSong("Nonexistent Song"));
    }
}
