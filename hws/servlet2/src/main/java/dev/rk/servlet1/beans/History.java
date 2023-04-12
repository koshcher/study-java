package dev.rk.servlet1.beans;

public class History {
    private final String text = "Lenovo is a Chinese multinational technology company that designs, develops, manufactures, and sells personal computers, tablets, smartphones, workstations, servers, electronic storage devices, and IT management software. The company was founded in Beijing in 1984 as Legend Computer Group by Liu Chuanzhi with a group of ten engineers. The company initially focused on manufacturing and selling computer parts such as circuit boards, but later expanded its operations to include computer sales.\n" +
            "\n" +
            "In 1990, the company introduced its first personal computer, the Legend Chinese Character Card, which was aimed at the Chinese market. The following year, the company launched the Legend PC, which became the best-selling computer in China. In 1994, the company changed its name to Legend Holdings, and in 2004, the company changed its name again to Lenovo.\n" +
            "\n" +
            "In 2005, Lenovo acquired IBM's Personal Computing Division, making it the world's third-largest personal computer maker. This acquisition also included the ThinkPad brand, which had been highly regarded for its high-quality design and reliability. The acquisition propelled Lenovo into the global market and helped the company become a major player in the computer industry.\n" +
            "\n" +
            "In 2011, Lenovo announced that it would begin producing smartphones and tablets under the Lenovo brand. In 2014, Lenovo acquired Motorola Mobility from Google, further expanding its presence in the mobile phone industry.\n" +
            "\n" +
            "Today, Lenovo is the world's largest personal computer vendor by unit sales, and the fourth-largest smartphone company in the world. The company is headquartered in Beijing, China, and has operations in more than 60 countries. Lenovo's products are sold in more than 160 countries and territories, and the company employs more than 60,000 people worldwide.";

    private final String link = "https://en.wikipedia.org/wiki/Lenovo";
    private final String img = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Lenovo_western_headquarters_%2820170707113944%29.jpg/800px-Lenovo_western_headquarters_%2820170707113944%29.jpg";

    public String getText() {
        return text;
    }

    public String getImg() {
        return img;
    }

    public String getLink() {
        return link;
    }
}
