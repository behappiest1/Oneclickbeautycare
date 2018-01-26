package com.ocbc.behappiest.oneclickbeautycare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class DisplayActivity extends AppCompatActivity {

    private Bundle extras;
    private TextView displaytitleview;
    private TextView displaydetailsview;
    private String details;
    private AdView mAdView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //Ads ID
        MobileAds.initialize(this, "ca-app-pub-3619509610342029~7357622212");
        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);

        extras = getIntent().getExtras();
        if (extras != null){
            String title = String.valueOf(extras.get("title"));

            switch (title){
                case "Habits That Cause Wrinkles and Finelines":
                    details = "Here are some beauty habits that causes finelines and wrinkles.\n" +
                            " Hot shower: – Generally, hot showers open the skin pore and cleanse it nicely as well as it helps to relax your mood. However, prolong exposure to hot water causes dehydration and that invites winkle and fineline. It is good to spend less time in hot shower.\n" +
                            "Excessive exfoliation: – Exfoliation is good to remove dead cells but too much exfoliation causes premature aging. Mild exfoliation twice in a week is good for your skin.\n" +
                            "Sleep with makeup: – Makeup has tendency to absorb dirt and pollutant; prolong makeup can damages your skin badly. It is advisable to remove your makeup completely before going to bed.\n" +
                            "Last but not least: – Harsh chemical based beauty products also ruin your skin beauty. Excessive use, of harsh cleanser remove the essential natural oils and promotes skin dehydration that causes wrinkles and finelines.\n";
                    break;

                case "Home Remedies For Overnight Eyebrow Growth":
                    details = "Try natural remedies to grow your eyebrow and enhance the beauty of your face.\n" +
                            "Oil massage: - Apply little amount of castor oil, olive oil or coconut oil before going to bed. Massage gives strengthening the hair as well as helps to enhance the growth of your eyebrow.\n" +
                            "Onion juice: - Apply onion juice on your eyebrows and leave it overnight to improve the hair follicles and promotes regrowth of your eyebrows.\n" +
                            "Milk: - Milk is another best remedy to enhance the eyebrow growth.\n" +
                            "Fenugreek: - Make a paste of fenugreek seeds with the help of water and apply it on the eyebrows. Leave it for 30 minutes then wash it off.\n";
                    break;

                case "How To Get Rid Of Dead Skin Cells":
                    details = "Regular exfoliation is essential to keep your skin free from dead cells. Dead cells generally deposit on your face, feet and any other part of body. Natural home remedies work best on your skin.\n" +
                            "Home remedy 1: -\n" +
                            "Ingredients: -\n" +
                            "A cup of brown sugar\n" +
                            "6-7 tsp coconut oil\n" +
                            "4 tsp of honey\n" +
                            "Mix all the ingredients then apply it on your skin and give gentle circular motion massage for few minutes. Lastly, rinse it with lukewarm water.\n" +
                            "Home remedy 2: -\n" +
                            "Ingredients: -\n" +
                            "6-7 tsp of oatmeal\n" +
                            "2 tsp of lemon juice\n" +
                            "Little amount of milk\n" +
                            "Mix it and apply it on your skin. Give massage for 5-7 minutes then wash it off.\n" +
                            "Home remedy 3: -\n" +
                            "Ingredients:-\n" +
                            "Half cup of coffee\n" +
                            "4-5 tsp of almond oil\n" +
                            "Take a bowl and mix all the ingredients then apply it. It helps to remove dead cells and gives you smooth skin.\n";
                    break;

                case "Herbs for Healthy Hair and Glowing Skin":
                    details = "Herbs are best remedy to nourishes your skin and hair. It is good to create your own beauty product using fresh herb extracts.\n" +
                            "Hibiscus: -  Hibiscus flower contain antioxidants and vitamins that helps to improve hair texture and scalp health. It promotes hair growth, prevents gray hair and removes dandruff.\n" +
                            "Aloe vera: - Aloe vera gel that present inside its leaves can be used to repair hair and skin which is damaged by sun or heat. Aloe vera gel can also be used to get rid of dandruff and itchy scalp.\n" +
                            "Parsley: - Parsley is good herb to combat with wrinkles and improve skin texture. It helps to maintain Ph-level of skin and prevent acne formation. Parsley contain antioxidant that helps to prevent hair fall.\n" +
                            "Rose: - You can use rose petals to prepare rose water at home. Rose water is excellent skin toner and mild astringent that suits to all type of skin.\n";
                    break;

                case "Natural Anti-tanning Face Pack":
                    details = "This post is dedicated to all the women and girls who tan badly and lost skin shine.\n" +
                            "Ingredients:\n" +
                            "Orange peel: anti-microbial and anti-bacterial properties.\n" +
                            "Almond oil: - Reduces the skin pigmentation\n" +
                            "Milk: Skin lightening property\n" +
                            "Method: - Take 2 tsp of orange peel powder, a tsp of almond paste and milk as per requirement. Now take a bowl and mix all the ingredients then apply it on your face along with neck. Let it sit for 20 minutes then wash it. You will get smooth and glowing skin. Regular usage of this pack will effectively remove all the tan.\n" +
                            " \n" +
                            "Link: http://oneclickbeautycare.com/skincare/natural-anti-tanning-face-pack/\n";
                    break;

                case "Scrub To Tighten Skin Pores":
                    details = "Let us try natural ingredients that helps to even out your skin tone, improves overall skin texture and cleans your skin pore nicely.\n" +
                            "What you need: –\n" +
                            "Lemon juice: Natural astringent property that helps to brighten your skin complexion and tighten your skin pores.\n" +
                            "Sugar: – Natural exfoliator to even out your tone.\n" +
                            "Firstly, rinse your face with lukewarm water to open the skin pores. Now apply lemon juice-sugar mixed scrub on your face. Give gentle circular motion massage for a minute then let it sit for another 2 more minutes. Lastly, rinse off with cool water.\n" +
                            "Benefits: –\n" +
                            "•\tGet soft skin\n" +
                            "•\tFairer complexion\n" +
                            "•\tEven out skin tone\n" +
                            "•\tPrevent acne formation\n" +
                            "•\tMakes your skin shiny\n" +
                            "Note: – Repeat this process once in a week to get desire result.\n";
                    break;

                case "Natural Bleach To Lighten Your Skin Tone":
                    details = "There is list of natural skin bleacher that have powerful bleaching property that will reduce skin pigmentation as well as suppress the melanin production. Your skin condition not only dependent on what you apply but also on what you eat as well.\n" +
                            "•\tTake a tsp of ground orange peel powder and little amount of milk. Mix it and apply it evenly through your face and neck. Leave it for 10 minutes then clean it. Repeat this process daily to get fairer skin tone.\n" +
                            "•\tSmash a ripe papaya into smooth pulp then add few drops of lemon juice. Apply it on your face and leave it for 15 minutes. Rinse your face thoroughly with water only. You will get smooth, shiny face.\n" +
                            "•\tTake equal amount of honey, turmeric powder and yogurt. Mix it and apply it on your face. Leave it to dry for 15 minutes then rinse it.\n" +
                            "•\tApply plain yogurt on your skin and leave it for 20 minutes then rinse it. It helps to unclog the skin pores, remove impurities and exfoliate your skin naturally.\n";
                    break;

                case "Natural Glossy Lips":
                    details = "Let us see the easiest way to keep your lips glossy as well as protect your lips from dryness. Olive oil is best oil to keep your lips soft and glossy. Olive oil enriched with omega 3 fatty acid that helps to keep your lips hydrate naturally.\n" +
                            "Apply little amount of olive oil on your lips before going to bed. Repeat this process daily. You will get beautiful, soft and glossy lips.\n";
                    break;

                case "Scrub for Acne Treatment":
                    details = "Homemade natural scrub helps to treat and prevent skin breakouts. Homemade scrub is good to sweep away dead cells and clean the pores deeply.\n" +
                            "Ingredients that you will require: -\n" +
                            "4 tsp of coconut oil\n" +
                            "1/2 tsp of cinnamon powder\n" +
                            "4 tsp of coffee\n" +
                            "Methods: - Take a bowl and mix all the ingredients and make a paste. Apply this paste on your body and give gentle circular motion massage for 2 minutes. It helps to remove dead cells and dirt from your skin.\n";
                    break;

                case "Amazing Beauty Tips with Vaseline":
                    details = "Keep a small box of Vaseline and use it to enhance your beauty.\n" +
                            "Lips care: - Vaseline keeps your lips hydrate, soft and smooth.\n" +
                            "Skin care: - Vaseline works wonder on dry skin. Vaseline gives proper moisturizer to your skin.\n" +
                            "Nail care: - Apply thin coat of Vaseline on your nails. It moisturizes, condition and add shine on your nails.\n" +
                            "Wrinkle treatment: - Before going to bed apply Vaseline on affected area. It cures fine lines and wrinkles.\n" +
                            "Soft feet: -Apply generous amount of Vaseline on your feet that helps to heal your crack feet and keep it smooth.\n" +
                            "Split ends: - Apply thin layer of Vaseline to the hair ends to make them look healthy.\n";
                    break;

                case "Beauty Benefits Of Rose Essential Oil":
                    details = "We have variety essential oil and every essential oil have its own benefits. Today, we are sharing the benefits of rose essential oil. Rose oil works wonder on dry skin. It helps to improve skin texture and tone.\n" +
                            "Benefits: -\n" +
                            "•\tTreat skin dryness\n" +
                            "•\tGives youthful skin\n" +
                            "•\tRefine skin texture\n" +
                            "•\tProvide proper skin moisturizer\n" +
                            "How to use: - Add 2 drops of rose essential oil in your body moisturizer or cream. Mix it and apply it. It helps to treat acne, blemish and dryness.\n";
                    break;

                case "How To Enhance Your Beauty Naturally":
                    details = "Let us see simple, amazing beauty tips to enhance your beauty naturally.\n" +
                            "Do meditation: - Meditation, breathing exercise and mild exercise is best way to enhance blood circulation and easing the stress. In short, you will look more beautiful with regular practice of mediation.\n" +
                            "Drink water: - Water keeps your skin hydrate and smooth. Water helps to unclog the skin pores and flush out the toxins that making you more beautiful.\n" +
                            "Moisturizer: - Moisturize is essential to keep your skin hydrate. Cocoa butter, coconut oil, olive oil and avocado butter are some of the natural skin moisturizer. Apply generous amount of moisturizer on your skin after taking bath.\n" +
                            "Cleanse the right way: - Exfoliate your skin gently on regular basis. Always use mild and soap-free cleanser that helps to enhance your beauty.\n";
                    break;

                case "Best Ingredients for Hair Care":
                    details = "There are several natural ingredients that can be used in hair care products, but we never know which one actually work. Let us see the tried and tested ingredients that works wonder on your hair.\n" +
                            "Honey: - Honey has antioxidant, anti-fungal as well as natural wax property that making it good hair conditioner. Mix honey with little amount of water and apply it on your hair.\n" +
                            "Fenugreek: - Fenugreek cure many hair problems such as hair dryness, roughness and dandruff. Soak it overnight and next morning make a thick paste then apply it on your hair.\n" +
                            "Amla: - Amla is another best hair care product that nourishes your hair from root to tip. Mix amla powder with water then apply it.\n" +
                            "Neem: - Neem is best remedy for itchy scalp, dandruff and head lice. Take 20-30 neem leaves and 2 cup of water. Boil it for 10 minutes then filter it. Let it sit for some time to cool-down its temperature.  Rinse your hair with this extract and leave it for 5 minutes then wash your hair with water only.\n" +
                            "Coconut milk: - Coconut milk is good to penetrate your hair deeply and provide hair strengthening. Directly apply coconut milk on your hair and leave it for 2 hours then wash it off.\n";
                    break;

                case "Want Healthy and Thicker Hair":
                    details = "Castor oil is one of the best hair care oil. It carries omega-6 essential fatty acids and ricinoleic acid that accelerate blood circulation to scalp, hence increases hair growth. Castor oil nourishes your scalp and provide hair root strengthening.\n" +
                            "Ingredient: -\n" +
                            "Lukewarm castor oil\n" +
                            "Apply lukewarm castor oil on your scalp and give gentle circular motion massage for 5 minutes. Leave it overnight. Next morning washes your hair with mild shampoo. Repeat this process twice in a week.\n" +
                            "Benefits: -\n" +
                            "•\tBoosts blood circulation to the hair follicles.\n" +
                            "•\tGives essential nutrition to your scalp and hair.\n" +
                            "•\tPromotes faster hair growth\n";
                    break;

                case "Makeup Tips To Get Dewy Skin":
                    details = "Personally, I like dewy makeup and it looks more attractive than matte finish. In dewy makeup you will look more attractive and youthful. Here are few makeup tips that you will need to do to get a dewy skin.\n" +
                            "Cleanse: – First step is to cleanse your face with mild face wash that is suitable for your skin type.\n" +
                            "Moisturizer: – Apply moisturizer on your face and give gentle massage for a minute. Moisturizer goes deep into your skin and nourish it properly.\n" +
                            "BB cream: – Avoid using of foundation because it gives you matte look. Use BB cream that gives more coverage and helps to prevent your face to look cakey.\n" +
                            "Conceal: – Select the concealer that closest to your skin tone and go for the one that has highlight effect. Use blending sponge to provide even coverage. Lastly, set the concealer with setting powder.\n" +
                            "Highlight: – Highlighter is the next makeup tip that you must follow. Highlight the bridge of your nose and your cheekbones.\n" +
                            "Blush: – To get a dewy look, it is really important to have flushed cheeks. Apply blusher on your cheek bone to get healthy cheek look.\n";
                    break;

                case "DIY How To Improve Weak Nails":
                    details = "Here are some tips that can help you to get strong and healthy nails.\n" +
                            "Mini manicure at home: – Take a cotton ball then dip it into some vitamin E oil. Now apply it on your nails gently and push back the cuticles at about 45 degrees. Now, apply a coat of nail strengthening polish. Before going to bed, do not forget to apply moisturizer on your nails.\n" +
                            "File your nails rightly: – File your nails with proper technique. Avoid filing your nails in a back and forth motion. Always file your nails in one direction.\n" +
                            "Use without acetone nail polish remover: – Acetone based nail polish remover can contribute to brittle nails. It is good to use acetate based nail remover.\n" +
                            "Keep hydrate: – Drink plenty amount of water to keep your nails hydrate and have a glass of milk daily. Milk contains zinc that helps to make your nails stronger.\n";
                    break;

                case "How To Remove Nasty Boils Naturally":
                    details = "Most of the time boils are painful, pus-filled and occurs at any part of our body. Whether you have boils are puss filled with whitish scaly or red nodules, milk mask can treat all of them, without leaving the mark.\n" +
                            "Step 1: - Boil the milk at low flame then let the milk cool in room temperature.\n" +
                            "Step 2: - Add 2 tsp of salt into it.\n" +
                            "Step 3: - Lastly, add bread crumbs.\n" +
                            "Step 4: - Mix it and make a thick paste. Now apply it directly on your boils.\n" +
                            "Let it sit for 40 minutes then rinse it and give pat dry. Repeat this process twice in a day. It is one of the easy ways to treat your nasty boils.\n";
                    break;

                case "How To Exfoliate Your Skin":
                    details = "Exfoliation is one of the best ways to keep your skin looking fresh and glowing. Most of time when you wash your face, the dirt from the top layer of skin removed but the dirt that settles in the inner layers is still present. Exfoliation is skin regeneration process that helps to clean your skin deeply, remove dead cells, and reveal the new skin underneath.\n" +
                            "Physical exfoliation: – Sugar scrub, salt scrub or apricot granules or walnut shells are all ways to physical exfoliate the skin. It can be either harsh or gentle depending on what we choose. Effects of physical exfoliation are short lived. It does not exfoliate the skin on a deeper level.\n" +
                            "Chemical exfoliation: – Chemical exfoliation is the process that involves the chemicals like enzymes, glue-like substance that holds the cells together, peels and alpha hydroxyl acids. It mainly used for acne-prone skin. If it not done correctly or in right composition then it can harsh for your skin.\n" +
                            "How to exfoliate: –\n" +
                            "Step 1: – Take a damp cloth and soak in water. Now put this towel on your face to open up your pores.\n" +
                            "Step 2: – Wash your face with your regular face wash.\n" +
                            "Step 3: – Select exfoliation that is best suited to your skin type. Now give gentle circular motion massage for few minutes. Make sure that cover every inch of your face.\n" +
                            "Step 4: – Wash your face and pat it dry.\n" +
                            "Step 5: – Apply good moisturizer on your face.\n";
                    break;

                case "About Us":
                    details = "Hi friends, I am Arpita and mostly do work from home now. In my prior experience I have worked for Sulekha.com and Firefly e venture (100% subsidiary of HT media) in marketing profile. Like other working professionals during regular working days I did not get enough time to take care of my hair/skin and weekend would go in beauty parlor, taking appointment, spend a lot of time in traffic rather than spending quality time with my family. I used to spend lot of time and money on beauty products in spite of that I was worried about the beauty care products that are available in the market for de-tanning , skin tightening , wrinkles, Dark circles, dullness, hair care, etc.  But my main worry was to choose the right product… I was ready to pay for 100% herbal product or those products which have no side effects but it was tough task for me. Generally I used to discuss with my friend and family, they had also similar confusion. This used to upset me a lot of times. So I started looking for home remedies or natural care products which would help me to get rid of from all problems allowing me to save time for my family and friends.\n" +
                            "Just to share my personal experience I am highly inspired with my mom and her home remedies. She has a shinning skin and hair even at the age of 52 in spite of not using any cosmetics or beauty products. My mom has a strong believes that everyone has god gifted beauty and we only need to take care of it through natural ways.\n" +
                            "After doing lots of experiment I found that everything is available in our kitchen. We can go for home remedies without worry and most importantly without spending lots of money on expensive beauty products.\n" +
                            "From my past experiences I got fare idea about the power of online media where you can save time, money and efforts that’s why I have chosen this media to share some valuable tips. So I decided to start this blog “One click beauty solution” where one can read on easy home remedy beauty care tips.\n" +
                            "We need a lot of support from your side to make it popular and interesting. If you have any suggestions or ideas please contact us info@oneclickbeautysolution.com\n";
                    break;

                case "Contact Us":
                    details = "If you have any suggestions or ideas please contact us info@oneclickbeautysolution.com";
                    break;

            }

            displaytitleview = findViewById(R.id.displaytitileID);
            displaydetailsview = findViewById(R.id.displaytextID);

            displaytitleview.setText(String.valueOf(title));
            displaydetailsview.setText(details);
        }
    }
}
