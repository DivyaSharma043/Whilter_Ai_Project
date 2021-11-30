package com.whilterAiProject.services;

import com.whilterAiProject.entities.Tag;
import com.whilterAiProject.entities.VideoClip;
import com.whilterAiProject.repositories.TagRepository;
import com.whilterAiProject.repositories.VideoClipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TagServices {

    @Autowired
    TagRepository tagRepository;

    @Autowired
    VideoClipRepository videoClipRepository;

//      *--------------------------CREATE SINGLE TAG-----------------------------*

    public void addSingleTag(Tag tags)
    {
        tagRepository.save(tags);
    }

//      *--------------------------CREATE MULTIPLE TAGS--------------------------*

    public List<Tag> addMultipleTags(List<Tag> tags)
    {
        return (List<Tag>) tagRepository.saveAll(tags);
    }

//      *--------------------------GET TAG BY ID--------------------------------*

    public Optional<Tag> getTagById(long tagId)
    {
        return tagRepository.findById(tagId);
    }

//      *--------------------------GET ALL TAGS-----------------------------*

    public List<Tag> getAllTags()
    {
        return (List<Tag>) tagRepository.findAll();
    }

//      *--------------------------UPDATE TAG-----------------------------*

    public Tag updateTag(Long tagId, Long videoClipId)
    {
        Tag tags = tagRepository.findById(tagId).get();
        VideoClip videoClip = videoClipRepository.findById(videoClipId).get();
        tags.assignVideoClip(videoClip);
        return tagRepository.save(tags);
    }

//      *--------------------------DELETE TAG-----------------------------*

    public void deleteTag(Long tagId)
    {
        tagRepository.deleteById(tagId);
    }
}
