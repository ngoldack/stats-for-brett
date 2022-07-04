package de.ngoldack.statsforbrett.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Data
public class BGGBoardgame {
    @XmlElement
    private String thumbnail;
    @XmlElement
    private String image;
    @XmlElement
    private String description;
    @XmlElement
    private int yearPublished;
    @XmlElement
    private int minPlayers;
    @XmlElement
    private int maxPlayers;

    @XmlElement
    private int playtime;
    @XmlElement
    private int minPlaytime;
    @XmlElement
    private int maxPlaytime;

    private int minAge;

    // TODO Category
    // TODO Family
    // TODO Expansion
}
