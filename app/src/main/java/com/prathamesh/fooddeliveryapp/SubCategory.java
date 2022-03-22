package com.prathamesh.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.prathamesh.fooddeliveryapp.Adapters.ProductAdapter;
import com.prathamesh.fooddeliveryapp.Fragments.CategoryFragment;
import com.prathamesh.fooddeliveryapp.Interfaces.ProductViewListener;
import com.prathamesh.fooddeliveryapp.ModelClasses.Product;
import com.prathamesh.fooddeliveryapp.ModelClasses.Subcategory;

import java.util.ArrayList;

public class SubCategory extends AppCompatActivity implements ProductViewListener {
    private ImageView ivBack,productImage;
    private TextView tvCatName,productName,productPrice,productDesc;
    private RecyclerView recyclerViewSubCategory;
    private static ArrayList<Product> productList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
        recyclerViewSubCategory = findViewById(R.id.rvSubCategoryRecyclerView);
        tvCatName = findViewById(R.id.categoryName);
        ivBack= findViewById(R.id.backButton);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        BuildListSubCategory();
        setRecyclerViewSubCategory();
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CategoryFragment fragment = new CategoryFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.MainScreenContainer, fragment);
                transaction.commit();
            }
        });
    }
    public static ArrayList<Product> getProductList(){
        return productList;
}
    private void setRecyclerViewSubCategory() {

        ProductAdapter adapter = new ProductAdapter(productList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewSubCategory.setLayoutManager(linearLayoutManager);
        recyclerViewSubCategory.setAdapter(adapter);
    }

    private void BuildListSubCategory() {
        String data = Subcategory.getCategoryId();
        if ("Home1".equals(data)) {
            homeProduct("Home1");
        } else if ("Home2".equals(data)) {
            homeProduct("Home2");
        } else if ("Home3".equals(data)) {
            homeProduct("Home3");
        } else if ("Home4".equals(data)) {
            homeProduct("Home4");
        } else if ("Chinese1".equals(data)) {
            chineseProduct("Chinese1");
        } else if ("Chinese2".equals(data)) {
            chineseProduct("Chinese2");
        } else if ("Chinese3".equals(data)) {
            chineseProduct("Chinese3");
        } else if ("Sea1".equals(data)) {
            seaFood("Sea1");
        } else if ("Sea2".equals(data)) {
            seaFood("Sea2");
        } else if ("Soup1".equals(data)) {
            soupFood("Soup1");
        } else if ("Soup2".equals(data)) {
            soupFood("Soup2");
        } else if ("Biryani1".equals(data)) {
            biryaniFood("Biryani1");
        } else if ("Biryani2".equals(data)) {
            biryaniFood("Biryani2");
        } else if ("Pizza1".equals(data)) {
            pizzaFood("Pizza1");
        } else if ("Pizza2".equals(data)) {
            pizzaFood("Pizza2");
        } else if ("Pizza3".equals(data)) {
            pizzaFood("Pizza3");
        } else if ("Pizza4".equals(data)) {
            pizzaFood("Pizza4");
        } else if ("Fast1".equals(data)) {
            fastFood("Fast1");
        } else if ("Fast2".equals(data)) {
            fastFood("Fast2");
        } else if ("Fast3".equals(data)) {
            fastFood("Fast3");
        } else if ("Fast4".equals(data)) {
            fastFood("Fast4");
        } else if ("Street1".equals(data)) {
            streetFood("Street1");
        } else if ("Street2".equals(data)) {
            streetFood("Street2");
        } else if ("Street3".equals(data)) {
            streetFood("Street3");
        } else if ("Street4".equals(data)) {
            streetFood("Street4");
        } else if ("IceCream1".equals(data)) {
            iceCreamFood("IceCream1");
        } else if ("IceCream2".equals(data)) {
            iceCreamFood("IceCream2");
        } else if ("IceCream3".equals(data)) {
            iceCreamFood("IceCream3");
        } else if ("IceCream4".equals(data)) {
            iceCreamFood("IceCream4");
        } else if ("Sweet1".equals(data)) {
            sweetFood("Sweet1");
        } else if ("Sweet2".equals(data)) {
            sweetFood("Sweet2");
        } else if ("Sweet3".equals(data)) {
            sweetFood("Sweet3");
        } else if ("Sweet4".equals(data)) {
            sweetFood("Sweet4");
        }
    }

    private void homeProduct(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Home1")) {

            Product paneerPakoda = new Product(R.drawable.sweet_image, "Paneer Pakoda", "Fried Paneer ,serves 1", 150, 3.4, "Home11", true);
            productList.add(paneerPakoda);
            Product chickenPakoda = new Product(R.drawable.sweet_image, "Chicken Pakoda", "Fried Chicken ,serves 1", 200, 3.8, "Home12", false);
            productList.add(chickenPakoda);
            Product cheeseKurkura = new Product(R.drawable.sweet_image, "Cheese Kurkura", "Cheese balls ,serves 1", 170, 3.5, "Home13", true);
            productList.add(cheeseKurkura);
            Product chickenKoliwada = new Product(R.drawable.sweet_image, "Chicken Koliwada", "Chicken special ,serves 1", 250, 4.1, "Home14", false);
            productList.add(chickenKoliwada);
        } else if (key.equals("Home2")) {

            Product alooPalak = new Product(R.drawable.sweet_image, "Aloo Palak", "Gravy of Palak ,serves 1", 180, 4.4, "Home21", true);
            productList.add(alooPalak);
            Product vegKolhapuri = new Product(R.drawable.sweet_image, "Veg Kolhapuri", "Masala mix vegie,serves 1", 200, 4.8, "Home22", true);
            productList.add(vegKolhapuri);
            Product chickenKolhapuri = new Product(R.drawable.sweet_image, "Chicken Kolhapuri", "Masala Chivken vegie ,serves 1", 270, 4.5, "Home23", false);
            productList.add(chickenKolhapuri);
            Product chickenHandi = new Product(R.drawable.sweet_image, "Chicken Handi", "Chicken special ,serves 1", 280, 4.1, "Home24", false);
            productList.add(chickenHandi);
        } else if (key.equals("Home3")) {
            Product roti = new Product(R.drawable.sweet_image, "Roti", "Plain roti,serves 1", 30, 3.9, "Home31", true);
            productList.add(roti);
            Product butterNaan = new Product(R.drawable.sweet_image, "Butter Naan", "Naan with xtra butter on it,serves 1", 35, 3.8, "Home32", true);
            productList.add(butterNaan);
            Product alooParatha = new Product(R.drawable.sweet_image, "Aloo Paratha", "Aloo paratha,serves 1", 40, 3.8, "Home33", true);
            productList.add(alooParatha);
            Product cheeseNaan = new Product(R.drawable.sweet_image, "Cheese Naan", "Naan with cheese on it,serves 1", 40, 3.5, "Home34", true);
            productList.add(cheeseNaan);
        } else if (key.equals("Home4")) {

            Product vegPulav = new Product(R.drawable.sweet_image, "Veg Pulav", "Veg Pulav,serves 1", 130, 3.5, "Home41", true);
            productList.add(vegPulav);
            Product paneerPulav = new Product(R.drawable.sweet_image, "Paneer Pulav", "Pulav with paneer in it,serves 1", 180, 3.8, "Home42", true);
            productList.add(paneerPulav);
        }
    }

    private void chineseProduct(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Chinese1")) {

            Product vegCrispy = new Product(R.drawable.sweet_image, "Veg Crispy", "vegCrispy,serves 1", 180, 3.4, "chinese11", true);
            productList.add(vegCrispy);
            Product chickenChilly = new Product(R.drawable.sweet_image, "Chicken Chilly", "Chicken Chilly ,serves 1", 200, 3.8, "chinese12", false);
            productList.add(chickenChilly);

        } else if (key.equals("Chinese2")) {

            Product vegSingaporeRice = new Product(R.drawable.sweet_image, "Veg Singapore Rice", "Fried Rice with spl. ingredients,serves 1", 220, 4.4, "chinese21", true);
            productList.add(vegSingaporeRice);
            Product chickenChopperRice = new Product(R.drawable.sweet_image, "Chicken Chopper Rice", "chickenChopperRice,serves 1", 200, 4.8, "chinese22", false);
            productList.add(chickenChopperRice);

        } else if (key.equals("Chinese3")) {

            Product vegHakkaNoodles = new Product(R.drawable.sweet_image, "Veg Hakka Noodles", "Veg Hakka Noodles,serves 1", 200, 3.9, "chinese31", true);
            productList.add(vegHakkaNoodles);
            Product chickenManchowNoodles = new Product(R.drawable.sweet_image, "Chicken Manchow Noodles", "Chicken Manchow Noodles,serves 1", 220, 3.8, "chinese32", false);
            productList.add(chickenManchowNoodles);

        }
    }

    private void biryaniFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Biryani1")) {

            Product vegDumBiryani = new Product(R.drawable.sweet_image, "Veg Dum Biryani", "Veg Dum Biryani,serves 1", 200, 3.9, "biryani11", true);
            productList.add(vegDumBiryani);
            Product vegHyderabadiBiryani = new Product(R.drawable.sweet_image, "Veg Hyderabadi Biryani", "Veg Hyderabadi Biryani,serves 1", 210, 3.8, "biryani12", true);
            productList.add(vegHyderabadiBiryani);

        } else if (key.equals("Biryani2")) {

            Product chickenDumBiryani = new Product(R.drawable.sweet_image, "Chicken Dum Biryani", "Chicken Dum Biryani,serves 1", 220, 4.4, "biryani21", false);
            productList.add(chickenDumBiryani);
            Product chickenHyderabadiBiryani = new Product(R.drawable.sweet_image, "Chicken Hyderabadi Biryani", "Chicken Hyderabadi Biryani,serves 1", 200, 4.8, "biryani22", false);
            productList.add(chickenHyderabadiBiryani);

        }
    }

    private void seaFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Sea1")) {

            Product prawnTavaFry = new Product(R.drawable.sweet_image, "Prawn Tava Fry", "Prawn Tava Fry,serves 1", 200, 3.9, "seaFood11", false);
            productList.add(prawnTavaFry);
            Product prawnTandooriFry = new Product(R.drawable.sweet_image, "Prawn Tandoori Fry", "Prawn Tandoori Fry,serves 1", 210, 3.8, "seaFood12", false);
            productList.add(prawnTandooriFry);

        } else if (key.equals("Sea2")) {

            Product prawnBiryani = new Product(R.drawable.sweet_image, "Prawn's Biryani", "Prawn Biryani,serves 1", 220, 4.4, "seaFood21", false);
            productList.add(prawnBiryani);
            Product prawnDumBiryani = new Product(R.drawable.sweet_image, "Prawn Dum Biryani", "Prawn Dum Biryani,serves 1", 200, 4.8, "seaFood22", false);
            productList.add(prawnDumBiryani);

        }
    }

    private void soupFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Soup1")) {

            Product manchowSoup = new Product(R.drawable.sweet_image, "Manchow Soup", "Manchow Soup,serves 1", 100, 3.9, "soupFood11", true);
            productList.add(manchowSoup);
            Product royalSoup = new Product(R.drawable.sweet_image, "Royal Soup", "Royal Soup,serves 1", 110, 3.8, "soupFood12", true);
            productList.add(royalSoup);

        } else if (key.equals("Soup2")) {

            Product chickenManchowSoup = new Product(R.drawable.sweet_image, "Chicken Manchow Soup", "chicken Manchow Soup,serves 1", 120, 4.4, "seaFood21", false);
            productList.add(chickenManchowSoup);
            Product chickenRoyalSoup = new Product(R.drawable.sweet_image, "Chicken Royal Soup", "Chicken Royal Soup,serves 1", 130, 4.8, "seaFood22", false);
            productList.add(chickenRoyalSoup);

        }
    }

    private void streetFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Street1")) {

            Product vadaPav = new Product(R.drawable.sweet_image, "Vada Pav", "Vada Pav,serves 2", 80, 3.9, "streetFood11", true);
            productList.add(vadaPav);
            Product samosaPav = new Product(R.drawable.sweet_image, "Samosa Pav", "Samosa Pav,serves 2", 80, 3.8, "streetFood12", true);
            productList.add(samosaPav);

        } else if (key.equals("Street2")) {

            Product paniPuri = new Product(R.drawable.sweet_image, "Pani Puri", "Pani Puri,serves 1", 40, 4.4, "streetFood21", true);
            productList.add(paniPuri);
            Product ragadaPuri = new Product(R.drawable.sweet_image, "Ragada Puri", "Ragada Puri,serves 1", 40, 4.8, "streetFood22", true);
            productList.add(ragadaPuri);

        } else if (key.equals("Street3")) {

            Product masalaDosa = new Product(R.drawable.sweet_image, "Masala Dosa", "Masala Dosa,serves 1", 120, 4.4, "streetFood231", true);
            productList.add(masalaDosa);
            Product meduWada = new Product(R.drawable.sweet_image, "Medu Wada", "Medu Wada,serves 1", 130, 4.8, "streetFood32", true);
            productList.add(meduWada);
        } else if (key.equals("Street4")) {

            Product momosFromDelhi = new Product(R.drawable.sweet_image, "Momos From Delhi", "Momos From Delhi,serves 1", 100, 3.9, "streetFood41", true);
            productList.add(momosFromDelhi);
            Product cholleBhatureFromPunjab = new Product(R.drawable.sweet_image, "Cholle Bhature From Punjab", "Cholle Bhature From Punjab,serves 1", 110, 3.8, "streetFood42", true);
            productList.add(cholleBhatureFromPunjab);

        }
    }

    private void fastFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Fast1")) {

            Product potatoCornBurger = new Product(R.drawable.sweet_image, "Potato Corn Burger", "Potato Corn Burger,serves 1", 120, 4.4, "fastFood11", true);
            productList.add(potatoCornBurger);
            Product chilliBurger = new Product(R.drawable.sweet_image, "Chilli Burger with pepper relish", "Chilli Burger,serves 1", 130, 4.8, "fastFood12", true);
            productList.add(chilliBurger);


        } else if (key.equals("Fast2")) {

            Product clubSandwich = new Product(R.drawable.sweet_image, "Club Sandwich", "Club Sandwich,serves 1", 120, 4.4, "fastFood21", true);
            productList.add(clubSandwich);
            Product toastedStuffedSandwich = new Product(R.drawable.sweet_image, "Toasted Stuffed Sandwich", "Toasted Stuffed Sandwich,serves 1", 130, 4.8, "fastFood22", true);
            productList.add(toastedStuffedSandwich);

        } else if (key.equals("Fast4")) {

            Product chickenManchowSoup = new Product(R.drawable.sweet_image, "Chicken Manchow Soup", "chicken Manchow Soup,serves 1", 120, 4.4, "fastFood41", true);
            productList.add(chickenManchowSoup);
            Product chickenRoyalSoup = new Product(R.drawable.sweet_image, "Chicken Royal Soup", "Chicken Royal Soup,serves 1", 130, 4.8, "fastFood42", true);
            productList.add(chickenRoyalSoup);
        } else if (key.equals("Fast3")) {

            Product strawberryMilkshake = new Product(R.drawable.sweet_image, "Strawberry Milkshake", "Strawberry Milkshake,serves 1", 120, 4.4, "fastFood31", true);
            productList.add(strawberryMilkshake);
            Product mangoMilkshake = new Product(R.drawable.sweet_image, "Mango Milkshake", "Mango Milkshake,serves 1", 130, 4.8, "fastFood32", true);
            productList.add(mangoMilkshake);
        }
    }

    private void sweetFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Sweet1")) {

            Product appleHalwa = new Product(R.drawable.sweet_image, "Apple Halwa", "Apple halwa,serves 1", 100, 3.9, "sweet11", true);
            productList.add(appleHalwa);
            Product gajarHalwa = new Product(R.drawable.sweet_image, "Gajar Halwa", "Gajar Halwa,serves 1", 110, 3.8, "sweet12", true);
            productList.add(gajarHalwa);

        } else if (key.equals("Sweet2")) {

            Product basundi = new Product(R.drawable.sweet_image, "Basundi", "Basundi,serves 1", 120, 4.4, "sweet21", true);
            productList.add(basundi);
            Product kajuKatli = new Product(R.drawable.sweet_image, "Kaju Katli", "Kaju Katli,serves 1", 130, 4.8, "sweet22", true);
            productList.add(kajuKatli);

        } else if (key.equals("Sweet3")) {

            Product rasGulla = new Product(R.drawable.sweet_image, "Rasgulla", "Rasgulla,serves 1", 120, 4.4, "sweet31", true);
            productList.add(rasGulla);
            Product rasMalai = new Product(R.drawable.sweet_image, "Rasmalai", "Rasmalai,serves 1", 130, 4.8, "sweet32", true);
            productList.add(rasMalai);
        } else if (key.equals("Sweet4")) {

            Product mysorePak = new Product(R.drawable.sweet_image, "Mysorepak", "MysorePak,serves 1", 120, 4.4, "sweet41", true);
            productList.add(mysorePak);
            Product pongal = new Product(R.drawable.sweet_image, "Pongal", "Pongal,serves 1", 130, 4.8, "sweet42", true);
            productList.add(pongal);
        }
    }

    private void iceCreamFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("IceCream1")) {

            Product chocolateRoll = new Product(R.drawable.sweet_image, "Chocolate Roll", "Chocolate Roll,serves 1", 100, 3.9, "iceCream11", true);
            productList.add(chocolateRoll);
            Product snowCreamChocolate = new Product(R.drawable.sweet_image, "Chocolate Snow Cream", "Chocolate Snow Cream,serves 1", 110, 3.8, "iceCream12", true);
            productList.add(snowCreamChocolate);

        } else if (key.equals("IceCream2")) {

            Product strawberrySorbet = new Product(R.drawable.sweet_image, "Strawberry Sorbet", "Strawberry Sorbet,serves 1", 120, 4.4, "iceCream21", true);
            productList.add(strawberrySorbet);
            Product snowCreamStrawberry = new Product(R.drawable.sweet_image, "Strawberry Snow Cream", "Strawberry Snow Cream,serves 1", 130, 4.8, "iceCream22", true);
            productList.add(snowCreamStrawberry);

        } else if (key.equals("IceCream3")) {

            Product mixFruitSoft = new Product(R.drawable.sweet_image, "Mix Fruit Soft", "Mix Fruit Soft,serves 1", 120, 4.4, "iceCream31", true);
            productList.add(mixFruitSoft);
            Product snowCreamMixfruit = new Product(R.drawable.sweet_image, "Mix Fruit Snow Cream", "Mix Fruit Snow Cream,serves 1", 130, 4.8, "iceCream32", true);
            productList.add(snowCreamMixfruit);
        } else if (key.equals("IceCream4")) {

            Product thandaiKulfi = new Product(R.drawable.sweet_image, "Thandai Kulfi", "Thandai Kulfi,serves 1", 120, 4.4, "iceCream41", true);
            productList.add(thandaiKulfi);
            Product gulkandKulfi = new Product(R.drawable.sweet_image, "Gulkand Kulfi", "Gulkand Kulfi,serves 1", 130, 4.8, "iceCream42", true);
            productList.add(gulkandKulfi);
        }
    }

    private void pizzaFood(String key) {
        key = Subcategory.getCategoryId();
        if (key.equals("Pizza1")) {

            Product farmHouse = new Product(R.drawable.sweet_image, "Farm House", "Farm House,serves 1", 100, 3.9, "pizza11", true);
            productList.add(farmHouse);
            Product peppyPaneer = new Product(R.drawable.sweet_image, "Peppy Paneer ", "Peppy Paneer,serves 1", 110, 3.8, "pizza12", true);
            productList.add(peppyPaneer);

        } else if (key.equals("Pizza2")) {

            Product chickenSausage = new Product(R.drawable.sweet_image, "Chicken Sausage", "Chicken Sausage,serves 1", 120, 4.4, "pizza21", false);
            productList.add(chickenSausage);
            Product indiChickenTikka = new Product(R.drawable.sweet_image, "Indi Chicken Tikka", "Indi Chicken Tikka,serves 1", 130, 4.8, "pizza22", false);
            productList.add(indiChickenTikka);

        } else if (key.equals("Pizza3")) {

            Product vegLoaded = new Product(R.drawable.sweet_image, "Veg Loaded", "Veg Loaded,serves 1", 120, 4.4, "pizza31", true);
            productList.add(vegLoaded);
            Product paneerAndOnion = new Product(R.drawable.sweet_image, "Paneer & Onion", "Paneer & Onion,serves 1", 130, 4.8, "pizza32", true);
            productList.add(paneerAndOnion);
        } else if (key.equals("Pizza4")) {

            Product burgerPizza = new Product(R.drawable.sweet_image, "Burger Pizza", "Burger Pizza,serves 1", 120, 4.4, "pizza41", true);
            productList.add(burgerPizza);
            Product bonelessChickenWings = new Product(R.drawable.sweet_image, "Boneless Chicken Wings", "Boneless Chicken Wings,serves 1", 130, 4.8, "pizza42", false);
            productList.add(bonelessChickenWings);
        }
    }



    @Override
    public void onProductClick(Product product, int position) {
        BottomSheetDialog bottomSheetDialog= new BottomSheetDialog(this);
        productImage=bottomSheetDialog.findViewById(R.id.ivProductImageProductView);
        productName= bottomSheetDialog.findViewById(R.id.tvProductNameProductView);
        productPrice=bottomSheetDialog.findViewById(R.id.tvProductPriceProductView);
        productDesc=bottomSheetDialog.findViewById(R.id.tvProductDescProductView);
        bottomSheetDialog.setContentView(R.layout.fragment_product_view_bottom_sheet);
        productImage.setImageResource(product.getImageView());
        productName.setText(product.getProductName());
        productPrice.setText(product.getProductPrice()+"");
        productDesc.setText(product.getProductDescription());
        bottomSheetDialog.show();
    }
}
