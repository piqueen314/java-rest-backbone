package example.rest.db;

import javax.persistence.*;

@Entity
@Table(name = "words")
public class PersistentWord {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "word")
    private String word;

    @Column(name = "definition")
    private String definition;

    @Column(name = "type")
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
