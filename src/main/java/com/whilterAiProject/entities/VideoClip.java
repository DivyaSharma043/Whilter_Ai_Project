package com.whilterAiProject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VideoClips")
public class VideoClip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String s3Path;

    @JsonIgnore
    @OneToMany(mappedBy = "videoClip")
<<<<<<< HEAD
    private Set<Tag> tags= new HashSet<>();
=======
    private Set<Tag> tags = new HashSet<>();
>>>>>>> 6d593db1aba9a5ac0856c18051a4cef6473a2dce
}
