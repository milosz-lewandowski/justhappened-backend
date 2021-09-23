package pl.miloszlewandowski.emotions;

import javax.persistence.*;


// TODO: Decide to use emotions as enum, entity, or kind of DB dictionary

@Entity
@Table(name = "emotions")
public class Emotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emotionId;
    private String name;
//    private EmotionsGroup group;

    public Emotion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public EmotionsGroup getGroup() {
//        return group;
//    }

//    public void setGroup(EmotionsGroup group) {
//        this.group = group;
//    }

    public Long getEmotionId() {
        return emotionId;
    }

    public void setEmotionId(Long emotionId) {
        this.emotionId = emotionId;
    }
}
