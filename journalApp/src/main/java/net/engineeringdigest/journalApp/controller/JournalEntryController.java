package net.engineeringdigest.journalApp.controller;
import java.util.*;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    // Assuming JournalEntry is a class
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
@GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return true;

    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEnteryById(@PathVariable Long myId){
    return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEnteryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }

//    @PutMapping("id/{myId}")
//    public JournalEntry updateJournalById(@PathVariable Long myId){
//        return journalEntries.get(myId);
//    }

    @PutMapping("id/{id}")
    public JournalEntry getJournalEnteryById(@PathVariable Long id,@RequestBody JournalEntry myEntry){
        return journalEntries.put(id,myEntry);

    }

}
