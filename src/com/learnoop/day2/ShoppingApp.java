package com.learnoop.day2;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class ShoppingApp {

    public static void main(String[] args) {

        Items fishOil = new Items();

        List<String> images = new ArrayList<>();
        images.add("https://static-01.daraz.com.np/p/23de30b8016468fbae1733ca693f1b7c.png");
        images.add("https://static-01.daraz.com.np/p/23de30b8016468fbae1733ca693f1b7c.png");
        images.add("https://static-01.daraz.com.np/p/23de30b8016468fbae1733ca693f1b7c.png");
        fishOil.setImage(images);
        fishOil.setName("Nature's Care Australia Fish Oil, Omega 3, 1000mg, 200 Capsules");
        fishOil.setPrice(2780);
        fishOil.setDiscounted(true);
        fishOil.setDiscountPercentage(7);

        fishOil.setPromotionImage("https://static-01.daraz.com.np/p/ba3efe3c7c3b56b2ca54afe7e133df6a.jpg");

        List<ItemDescription> itemDescriptions = new ArrayList<>();
        ItemDescription description1 = new ItemDescription();
        description1.setDescription(" Department of Food Technology and Quality Control Registration Number : 01-76-77-000-62");

        itemDescriptions.add(description1);


        ItemDescription description2 = new ItemDescription();
        description2.setDescription("Suitable for Children Age 6 and above.");

        itemDescriptions.add(description2);

        fishOil.setDescription(itemDescriptions);


        //Reviews

        List<Review> reviews = new ArrayList<>();

        Review review1 = new Review();

        review1.setRating(5);

        Customer customer1 = new Customer();
        customer1.setUserName("Ajay M.");
        review1.setCustomer(customer1);
        review1.setVerifiedPurchase(true);

        review1.setReviewDescription("This is a very nice & trustable product in Nepal.Using it since years.Got it in 2653 with shipping.\n" +
                "Nice packaging too.Thank you");

        List<String> reviewImages = new ArrayList<>();
        reviewImages.add("");
        reviewImages.add("");

        review1.setImages(reviewImages);

        review1.setReviewDate(new Date("12 Nov 2021"));




    }
}
