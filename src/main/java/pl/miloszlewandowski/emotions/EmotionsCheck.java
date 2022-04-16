package pl.miloszlewandowski.emotions;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Getter
@Setter
@Entity
@Table(name = "emotions_checks")
@NoArgsConstructor
@AllArgsConstructor
public class EmotionsCheck {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @OneToMany
  private List<Emotion> emotionList;

}