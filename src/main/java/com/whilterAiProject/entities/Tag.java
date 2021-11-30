package com.whilterAiProject.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tags")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private String value;

    @ManyToOne(cascade = CascadeType.ALL)
<<<<<<< HEAD
    @JoinColumn(name = "videoClip_Id", referencedColumnName = "id")
=======
    @JoinColumn(name="videoClip_id", referencedColumnName = "id")
>>>>>>> 6d593db1aba9a5ac0856c18051a4cef6473a2dce
    private VideoClip videoClip;


    public void assignVideoClip(VideoClip videoClip) {
        this.videoClip= videoClip;
    }
}
