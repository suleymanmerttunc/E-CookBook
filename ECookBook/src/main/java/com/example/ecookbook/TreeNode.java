package com.example.ecookbook;
import java.util.LinkedList;
import java.util.Queue;

    // TreeNode sınıfı, ağaçtaki düğümleri temsil eder
    class TreeNode {
        String data;
        TreeNode left, right;
        int height;

        public TreeNode(String data) {
            this.data = data;
            this.height = 1;
        }
    }

    // AVLTree sınıfı, AVL ağacını temsil eder
    class AVLTree {
        TreeNode root;

        // Ağacın yüksekliğini döndüren yardımcı metot
        int height(TreeNode node) {
            if (node == null)
                return 0;
            return node.height;
        }

        // Yeni yüksekliği hesaplayan yardımcı metot
        int newHeight(TreeNode node) {
            if (node == null)
                return 0;
            return 1 + Math.max(height(node.left), height(node.right));
        }

        // Denge faktörünü hesaplayan yardımcı metot
        int balanceFactor(TreeNode node) {
            if (node == null)
                return 0;
            return height(node.left) - height(node.right);
        }

        // Düğümleri sağa döndüren yardımcı metot
        TreeNode rotateRight(TreeNode y) {
            TreeNode x = y.left;
            TreeNode T2 = x.right;

            x.right = y;
            y.left = T2;

            y.height = newHeight(y);
            x.height = newHeight(x);

            return x;
        }

        // Düğümleri sola döndüren yardımcı metot
        TreeNode rotateLeft(TreeNode x) {
            TreeNode y = x.right;
            TreeNode T2 = y.left;

            y.left = x;
            x.right = T2;

            x.height = newHeight(x);
            y.height = newHeight(y);

            return y;
        }

        // AVL ağacına düğüm ekleme metodu
        TreeNode insert(TreeNode node, String data) {
            if (node == null)
                return new TreeNode(data);

            if (data.compareTo(node.data) < 0)
                node.left = insert(node.left, data);
            else if (data.compareTo(node.data) > 0)
                node.right = insert(node.right, data);
            else
                return node; // Aynı düğümü birden fazla eklemeyi önle

            // Yükseklik güncellemesi
            node.height = newHeight(node);

            // Dengeliğin kontrolü
            int balance = balanceFactor(node);

            // Sol-sol durumu
            if (balance > 1 && data.compareTo(node.left.data) < 0)
                return rotateRight(node);

            // Sağ-sağ durumu
            if (balance < -1 && data.compareTo(node.right.data) > 0)
                return rotateLeft(node);

            // Sol-sağ durumu
            if (balance > 1 && data.compareTo(node.left.data) > 0) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }

            // Sağ-sol durumu
            if (balance < -1 && data.compareTo(node.right.data) < 0) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }

            return node;
        }


        // Ağacı dolaşarak yemek malzemelerini  yazdıran metot (inorder)
        String printIngredients(TreeNode node) {
            StringBuilder stringBuilder = new StringBuilder();
            if (node != null) {
                String leftIngredients = printIngredients(node.left);
                String rightIngredients = printIngredients(node.right);

                if (!leftIngredients.isEmpty()) {
                    stringBuilder.append(leftIngredients);
                    stringBuilder.append(", ");
                }

                stringBuilder.append(node.data);

                if (!rightIngredients.isEmpty()) {
                    stringBuilder.append(", ");
                    stringBuilder.append(rightIngredients);
                }
            }
            return stringBuilder.toString();
        }

        // Yemek malzemelerini yazdıran metot
        String printIngredients() {
            printIngredients(root);

            return printIngredients(root);
        }
    }

    // Tarifleri aşama aşama yazdıran metotların olduğu sınıf
    class PrintSteps {

        //VEGETERIAN

        public static String patatasBravasSteps() {
            Queue<String> patatasBravasRecipeSteps = new LinkedList<>();

            patatasBravasRecipeSteps.offer("Boil 4 or 5 potatoes, which you cut into cubes beforehand, in hot water.");
            patatasBravasRecipeSteps.offer("Saute 1 chopped onion for the sauce.");
            patatasBravasRecipeSteps.offer("Add 1 piece of garlic, 1 tablespoon chili powder, and ½ cup tomato puree and fry for 5 more minutes.");
            patatasBravasRecipeSteps.offer("Put the boiled potatoes in a pan. Cook, stirring occasionally, until they turn golden brown.");
            patatasBravasRecipeSteps.offer("Place the browned potatoes on a serving plate.");
            patatasBravasRecipeSteps.offer("Pass the sauce through a blender.");
            patatasBravasRecipeSteps.offer("After the sauce has cooled, add the vinegar and mayonnaise and mix.");
            patatasBravasRecipeSteps.offer("Add the sauce over the potatoes and serve. Your Patatas Bravas recipe is ready. Enjoy your meal!");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!patatasBravasRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(patatasBravasRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String ratatouilleSteps() {
            Queue<String> ratatouilleRecipeSteps = new LinkedList<>();

            ratatouilleRecipeSteps.offer("For the ratatouille recipe, first roast 1 capia pepper by placing a sheet pan on the stove. Then, while the pepper is still hot, cover it with cling film to preserve its flavor and place it on a plate.");
            ratatouilleRecipeSteps.offer("Add 2 tomatoes to the food processor and puree them. Peel the roasted red pepper, add it to the food processor, and blend with the tomatoes until you get a smooth consistency.");
            ratatouilleRecipeSteps.offer("Put 2 tablespoons of olive oil and ½ finely chopped onion in a pan. Start roasting slowly over low heat. Optionally, you can continue the roasting process by adding 2 pieces of garlic.");
            ratatouilleRecipeSteps.offer("Add the tomato sauce to the softened onions. Add 1 tablespoon granulated sugar, 1 tablespoon salt, 1/2 tablespoon black pepper, and 1 tablespoon fresh thyme and cook over low heat for 10-15 minutes.");
            ratatouilleRecipeSteps.offer("Remove the thyme from the slightly thickened sauce and spread the sauce on the bottom of an ovenproof dish.");
            ratatouilleRecipeSteps.offer("Slice 2 eggplants with their skins into thin and round slices. Soak them in salted water for 15 minutes to remove the bitter water. Then drain the water.");
            ratatouilleRecipeSteps.offer("Slice 2 zucchini thinly. Cut 1 tomato into the same size and shape. Put all the vegetables in a bowl. Add ½ tea cup of olive oil, 1 tablespoon salt, and other spices.");
            ratatouilleRecipeSteps.offer("In the bowl where you spread the tomato sauce, arrange your vegetables side by side from the outside to the inside. Drizzle olive oil over them. Add a few fresh thyme leaves on top.");
            ratatouilleRecipeSteps.offer("Cover with aluminum foil and make 4-5 holes with a knife. Bake in a preheated 190-degree oven for 20 minutes.");
            ratatouilleRecipeSteps.offer("After 20 minutes, remove the foil and bake for another 30 minutes.");
            ratatouilleRecipeSteps.offer("The lightly browned ratatouille is ready. Enjoy your meal!");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!ratatouilleRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(ratatouilleRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }


        public static String mucverSteps() {
            Queue<String> mucverRecipeSteps = new LinkedList<>();

            mucverRecipeSteps.offer("For the hash browns, grate 3 zucchini and 1 carrot. Ensure the zucchini is washed thoroughly in plenty of water. Use the coarse part of the grater. To prevent dilution of the hash browns, squeeze the juice out of the grated zucchini.");
            mucverRecipeSteps.offer("In a large bowl, combine the grated zucchini and carrot with 2 beaten eggs, 6 pieces of chopped spring onions, ½ bunch chopped dill, 1.5 teaspoons salt, and 1 teaspoon black pepper.");
            mucverRecipeSteps.offer("Add 1 tea glass of flour to the mixture and blend all the ingredients together until well combined.");
            mucverRecipeSteps.offer("Mix with a spatula until all the ingredients form a paste-like consistency.");
            mucverRecipeSteps.offer("Adjust each hash brown to approximately 1 heaping tablespoon and pour into a pan.");
            mucverRecipeSteps.offer("Fry the hash browns in hot oil until they are golden brown on both sides.");
            mucverRecipeSteps.offer("After frying, drain the excess oil from the hash browns by placing them on a paper towel.");
            mucverRecipeSteps.offer("Serve the zucchini hash browns on a serving plate and enjoy them with whipped yogurt.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!mucverRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(mucverRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }


        public static String falafelSteps() {
            Queue<String> falafelRecipeSteps = new LinkedList<>();
            falafelRecipeSteps.offer("Drain 1.5 cups of chickpeas that you soaked in water the night before and pour them into a food processor. (Chickpeas will not be boiled.)");
            falafelRecipeSteps.offer("Add 1 onion, 2 cloves of garlic, 1/4 bunch of parsley, and 2 spring onions to the chickpeas and run the food processor once.");
            falafelRecipeSteps.offer("After the food processor has extracted the ingredients, mix them together a little with a spatula.");
            falafelRecipeSteps.offer("Then add 1 teaspoon salt, 1 teaspoon black pepper, 1 teaspoon coriander, 1 teaspoon cumin, 1 teaspoon paprika, and 1 teaspoon baking powder. Process in a food processor until no coarse grains remain.");
            falafelRecipeSteps.offer("Put the prepared mixture in a deep bowl and add 2 tablespoons of flour. Do not knead at this stage. Leave the falafel mixture in the refrigerator for at least 1 hour to rest.");
            falafelRecipeSteps.offer("Take the falafel mixture out of the refrigerator and roll it with your hands by taking pieces smaller than a walnut.");
            falafelRecipeSteps.offer("When your falafel patties are ready, fry them in well-heated oil.");
            falafelRecipeSteps.offer("When frying the falafels, make sure to fry them over medium heat so that they cook well inside.");
            falafelRecipeSteps.offer("For the sauce, add 2 cloves of garlic, 2 tablespoons of tahini, and 1 tablespoon of lemon juice into the strained yogurt. Mix well.");
            falafelRecipeSteps.offer("Serve the fried falafel patties with the prepared sauce. Enjoy!");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!falafelRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(falafelRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String celeryWithOrangeSauceSteps() {
            Queue<String> celeryRecipeSteps = new LinkedList<>();

            celeryRecipeSteps.offer("Peel 2 celery root and cut it into cubes. To prevent discoloration, soak the celery in lemon juice.");
            celeryRecipeSteps.offer("Finely chop 1 onion. Slice 1 carrot thinly and sauté it with the onion in a pot where you have added 6 tablespoons of olive oil.");
            celeryRecipeSteps.offer("Then add the potatoes on top.");
            celeryRecipeSteps.offer("Add the celery and sauté for a while.");
            celeryRecipeSteps.offer("Sprinkle 1 teaspoon flour over the vegetables and stir.");
            celeryRecipeSteps.offer("Then add 1 teaspoon sugar, ½ teaspoon salt, 1 glass of orange juice, ½ glass lemon juice, and 1 glass of water.");
            celeryRecipeSteps.offer("Finally, place the celery stalk in the middle of the pot and cover it with a lid. Once it boils, simmer on low heat for about 25-35 minutes or until the vegetables are tender.");
            celeryRecipeSteps.offer("After cooking, let the dish rest before serving. Enjoy your meal!");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!celeryRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(celeryRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }


        // TATLILAR

        public static String halvaSteps() {
            Queue<String> halvaRecipeSteps = new LinkedList<>();
            halvaRecipeSteps.offer("Take 1.5 cups of sugar and 1.5 cups of water in a bowl and mix until the sugar dissolves. Keep it aside for later use.");
            halvaRecipeSteps.offer("First, put 125 grams of oil into the pot to be cooked and melt it.");
            halvaRecipeSteps.offer("Then add 2 cups of flour and a handful of walnuts.");
            halvaRecipeSteps.offer("Roast over medium heat, stirring constantly, for 10-15 minutes until its color changes.");
            halvaRecipeSteps.offer("Turn the heat down to very low.");
            halvaRecipeSteps.offer("Pour the cold syrup prepared earlier over the roasted flour and walnuts, stirring constantly.");
            halvaRecipeSteps.offer("At first, it will have a very watery consistency, but as you mix and heat, the flour will absorb the syrup.");
            halvaRecipeSteps.offer("When the halva reaches a good consistency, turn off the stove.");
            halvaRecipeSteps.offer("You can cover it and let it brew for about 5 minutes, or you can shape it immediately while it's hot.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!halvaRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(halvaRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String magnoliaSteps() {
            Queue<String> magnoliaRecipeSteps = new LinkedList<>();
            magnoliaRecipeSteps.offer("For Magnolia's pudding, take 5 cups of milk, 3/4 cup of granulated sugar, 4 tablespoons of flour, 1 egg and half a box of liquid cream in a suitable pot.");
            magnoliaRecipeSteps.offer("Start cooking by mixing the ingredients with a wire whisk.");
            magnoliaRecipeSteps.offer("Cook, stirring, until the pudding thickens and thickens, and then turn off the stove.");
            magnoliaRecipeSteps.offer("Add 1 pack of vanilla and mix it well, then put the pudding into a suitable mixing bowl.");
            magnoliaRecipeSteps.offer("While the pudding is waiting, cover it with stretch film to prevent it from crusting.");
            magnoliaRecipeSteps.offer("Put 1 pack of baby biscuits and 1 glass of roasted hazelnuts into the food processor and quickly blend them.");
            magnoliaRecipeSteps.offer("Beat the cooled pudding with a mixer for about two minutes.");
            magnoliaRecipeSteps.offer("Now you can start filling the dessert into the cups in which you will present it.");
            magnoliaRecipeSteps.offer("First, place the hazelnut biscuit mixture on the bottom of the cups. Smooth it with the back of a spoon for a better look.");
            magnoliaRecipeSteps.offer("Then, place sliced strawberries on the edges of the cups.");
            magnoliaRecipeSteps.offer("After arranging the strawberries, divide the pudding into the cups. Smooth the top of the pudding with the back of the spoon.");
            magnoliaRecipeSteps.offer("Finally, place the hazelnut biscuit mixture prepared earlier on top of the pudding. Decorate the magnolia with sliced strawberries.");
            magnoliaRecipeSteps.offer("After letting the desserts rest in the refrigerator for at least 2-3 hours, your strawberry magnolias are ready to serve. Enjoy your meal!");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!magnoliaRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(magnoliaRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String sanSebastianCheesecakeSteps() {
            Queue<String> cheesecakeRecipeSteps = new LinkedList<>();
            cheesecakeRecipeSteps.offer("Preheat the oven to 325°F (165°C). Grease a 9-inch springform pan.");
            cheesecakeRecipeSteps.offer("In a medium bowl, combine 150 grams of graham cracker crumbs, 1/4 cup sugar, and 1/2 cup melted butter.");
            cheesecakeRecipeSteps.offer("Press into the bottom of the prepared pan.");
            cheesecakeRecipeSteps.offer("In a large bowl, mix 4 packs of cream cheese with 250 grams of sugar until smooth.");
            cheesecakeRecipeSteps.offer("Mix 4 eggs one by one.");
            cheesecakeRecipeSteps.offer("Mix 160 ml sour cream, 160 ml heavy cream and 1 tablespoon vanilla.");
            cheesecakeRecipeSteps.offer("Pour the filling over the dough.");
            cheesecakeRecipeSteps.offer("Bake for 60 minutes or until the center is set.");
            cheesecakeRecipeSteps.offer("Cool, then refrigerate overnight before removing from pan.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!cheesecakeRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(cheesecakeRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String sutlacSteps() {
            Queue<String> sutlacRecipeSteps = new LinkedList<>();
            sutlacRecipeSteps.offer("Wash 2 tea glasses of rice and put it on the fire with water.");
            sutlacRecipeSteps.offer("Boil until the rice stretches and absorbs the water. Be careful not to burn the rice by turning the stove on too high a heat.");
            sutlacRecipeSteps.offer("Then add 1 liter of cold milk. Stir it 1-2 times and wait for it to boil.");
            sutlacRecipeSteps.offer("Meanwhile, in a bowl, crush 3 tablespoons of rice flour with 1 glass of cold milk. Make sure that there are no lumps left.");
            sutlacRecipeSteps.offer("Take 1-2 scoops of boiling milk in the pot and add it to the bowl. (rice flour should be warm).");
            sutlacRecipeSteps.offer("Add the rice flour to the pot and cook for 10 minutes, stirring occasionally.");
            sutlacRecipeSteps.offer("Add 2 cups of granulated sugar, stir and boil.");
            sutlacRecipeSteps.offer("Divide the rice pudding into bowls.");
            sutlacRecipeSteps.offer("Once the rice pudding has cooled down, you can serve it by sprinkling as much cinnamon as you like. Enjoy your meal.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!sutlacRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(sutlacRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String chocolateChipCookiesSteps() {
            Queue<String> cookiesRecipeSteps = new LinkedList<>();
            cookiesRecipeSteps.offer("Preheat your oven to 350°F (175°C).");
            cookiesRecipeSteps.offer("In a large bowl, cream 1 cup each butter, white sugar, and brown sugar until smooth.");
            cookiesRecipeSteps.offer("Beat 2 eggs one by one, then add 1 teaspoon of vanilla and mix.");
            cookiesRecipeSteps.offer("Dissolve 1 teaspoon of baking soda in hot water. Add it to the dough with half a teaspoon of salt.");
            cookiesRecipeSteps.offer("Mix 3 cups of flour and 340 grams of chocolate chips.");
            cookiesRecipeSteps.offer("Pour large spoonfuls into ungreased pans.");
            cookiesRecipeSteps.offer("Bake in the preheated oven for about 10 minutes or until the edges are nicely browned.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!cookiesRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(cookiesRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }


        //ZEYTİN YAĞLILAR

        public static String spinachWithOliveOilSteps() {
            Queue<String> spinachRecipeSteps = new LinkedList<>();
            spinachRecipeSteps.offer("Wash 500 grams of fresh spinach leaves thoroughly and drain excess water.");
            spinachRecipeSteps.offer("Heat 1/4 cup olive oil in a large pot over medium heat.");
            spinachRecipeSteps.offer("Add 1 finely chopped onion and 3 crushed cloves of garlic. Cook until the onions soften and become transparent.");
            spinachRecipeSteps.offer("Add 2 tablespoons of pine nuts to the pot and roast for a few minutes.");
            spinachRecipeSteps.offer("Add washed spinach leaves, 1 teaspoon of dried dill, juice of 1 lemon, 1 teaspoon of salt, and black pepper.");
            spinachRecipeSteps.offer("Cook, stirring occasionally, until the spinach becomes soft.");
            spinachRecipeSteps.offer("After the spinach is cooked, remove it from the stove. You can add salt and pepper if necessary.");
            spinachRecipeSteps.offer("You can serve spinach with olive oil hot or at room temperature.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!spinachRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(spinachRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String cauliflowerWithOliveOilSteps() {
            Queue<String> cauliflowerRecipeSteps = new LinkedList<>();
            cauliflowerRecipeSteps.offer("Heat 1/4 cup olive oil in a large skillet over medium heat.");
            cauliflowerRecipeSteps.offer("Add 1 finely chopped onion and 2 crushed cloves of garlic. Cook until the onions soften and become transparent.");
            cauliflowerRecipeSteps.offer("Add 2 medium-sized carrots, diced into cubes, to the pan. Cook, stirring, until the carrots soften a little.");
            cauliflowerRecipeSteps.offer("Add 1 medium-sized Cauliflower florets and 2 chopped tomatoes. Season with 1 teaspoon of ground pepper, salt, and black pepper.");
            cauliflowerRecipeSteps.offer("Cover the pan and cook until the cauliflower becomes soft, check by stirring occasionally. You can add some water to prevent sticking if necessary.");
            cauliflowerRecipeSteps.offer("When the cauliflower is cooked, remove it from the stove.");
            cauliflowerRecipeSteps.offer("Sprinkle chopped parsley on top before placing it on a serving plate.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!cauliflowerRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(cauliflowerRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String zucchiniStewSteps() {
            Queue<String> zucchiniStewRecipeSteps = new LinkedList<>();
            zucchiniStewRecipeSteps.offer("Wash the zucchinis well and peel them in various ways. Chop 4 zucchinis into pieces slightly larger than cubes.");
            zucchiniStewRecipeSteps.offer("Chop 1 Onion into small pieces. Chop 1 large tomato into cubes.");
            zucchiniStewRecipeSteps.offer("Put 4 tablespoons of oil in a wide-based pot and heat it. Then start frying the onions.");
            zucchiniStewRecipeSteps.offer("When the onions change color, add 1 teaspoon of tomato paste and continue frying with the tomato paste.");
            zucchiniStewRecipeSteps.offer("Add the zucchinis, mix, and cook for a while.");
            zucchiniStewRecipeSteps.offer("Then add tomatoes, 1 teaspoon of sugar, and 1 spoon of spices, mix.");
            zucchiniStewRecipeSteps.offer("Cook on low heat for about 15-20 minutes until the zucchinis are tender, do not forget to open the lid and stir in between.");
            zucchiniStewRecipeSteps.offer("Remove from the stove, sprinkle with finely chopped dill and serve. Enjoy your meal.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!zucchiniStewRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(zucchiniStewRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String artichokeWithOliveOilSteps() {
            Queue<String> artichokeRecipeSteps = new LinkedList<>();
            artichokeRecipeSteps.offer("In a pan, fry half a glass of olive oil and 1 diced onion until it turns slightly pink.");
            artichokeRecipeSteps.offer("Add 1 diced and boiled potato and a large carrot each and fry for 2-3 minutes.");
            artichokeRecipeSteps.offer("After adding 1 cup of peas, remove your garnish from the stove 3-4 minutes later.");
            artichokeRecipeSteps.offer("To prepare the sauce in which you will cook the artichokes, mix the juice of 2 squeezed lemons, 1 glass of water, 1 teaspoon of granulated sugar, 1 teaspoon of salt, and 2 tablespoons of olive oil in a bowl.");
            artichokeRecipeSteps.offer("Place 8 artichokes in a large pot and top them with the garnish you prepared.");
            artichokeRecipeSteps.offer("Transfer the lemon water mixture into the pot.");
            artichokeRecipeSteps.offer("Then close the lid and cook until the artichokes soften, your meal is ready.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!artichokeRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(artichokeRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String sarmaSteps() {
            Queue<String> sarmaRecipeSteps = new LinkedList<>();
            sarmaRecipeSteps.offer("To prepare the stuffing of the stuffing; Heat half a glass of olive oil in a wide-based pot.");
            sarmaRecipeSteps.offer("Fry 3 grated onions until they turn light brown.");
            sarmaRecipeSteps.offer("Then add 1.5 tablespoons of pine nuts and continue roasting.");
            sarmaRecipeSteps.offer("Roast 1.5 cups of rice, which you have soaked in warm water for about 5 minutes and then drained, together with the onions until the rice becomes transparent.");
            sarmaRecipeSteps.offer("Then respectively; Add 1 tablespoon of currants, 1 teaspoon each of salt, black pepper, allspice, and cinnamon and mix.");
            sarmaRecipeSteps.offer("Add about 1 glass of hot water and cook the stuffing on low heat for 5 minutes, then remove it from the stove.");
            sarmaRecipeSteps.offer("Open the pickled vine leaves on the counter, leaving the veined parts on top. In the middle part of each leaf; Prepare and share a teaspoon of the warmed stuffing.");
            sarmaRecipeSteps.offer("Bring the edges in and move from the wide part to the tip. Wrap all the leaves tightly.");
            sarmaRecipeSteps.offer("Cover the bottom of the sarma pot with a few vine leaves.");
            sarmaRecipeSteps.offer("Arrange the stuffed wraps in a row, side by side. After slicing the lemon into rings, place it on the wraps.");
            sarmaRecipeSteps.offer("To prevent them from opening during cooking; Cover them with a flat serving plate.");
            sarmaRecipeSteps.offer("After adding 1.5 cups of hot water and 2 tablespoons of olive oil to the pot, cook the stuffed wraps over low heat for about 35 minutes.");
            sarmaRecipeSteps.offer("According to desire; Serve warm or cold.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!sarmaRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(sarmaRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }


        // ETLİ YEMEKLER

        public static String karnıyarıkSteps() {
            Queue<String> karnıyarıkRecipeSteps = new LinkedList<>();
            karnıyarıkRecipeSteps.offer("Wash the eggplants in plenty of water, peel them in stripes, and soak them in salt water.");
            karnıyarıkRecipeSteps.offer("Heat 3 tablespoons of olive oil in a pan.");
            karnıyarıkRecipeSteps.offer("Add 1 chopped onion and fry until it turns pink.");
            karnıyarıkRecipeSteps.offer("Add 2 chopped green peppers and continue roasting.");
            karnıyarıkRecipeSteps.offer("Add 350 grams of medium-fat ground meat and cook it with the roasted onions until it takes color and absorbs its water.");
            karnıyarıkRecipeSteps.offer("Stirring in between and continuing the cooking process, respectively; Add 2 cloves of garlic, half a teaspoon of tomato paste, half a teaspoon of pepper paste, 1 teaspoon each of salt and black pepper.");
            karnıyarıkRecipeSteps.offer("Add 2 diced tomatoes, cook for about 5 minutes, then reduce the heat and add a handful of chopped parsley, stir one last time, and remove from the stove.");
            karnıyarıkRecipeSteps.offer("Fry 6 eggplants that you have peeled and put away in stripes.");
            karnıyarıkRecipeSteps.offer("Place in an ovenproof dish.");
            karnıyarıkRecipeSteps.offer("Cut the eggplants in half from the middle.");
            karnıyarıkRecipeSteps.offer("Add plenty of the stuffing you prepared.");
            karnıyarıkRecipeSteps.offer("Add cherry tomatoes and pepper slices on the eggplants.");
            karnıyarıkRecipeSteps.offer("After cooking the karnıyarık in a preheated oven at 170 degrees for 20-25 minutes, serve it hot, accompanied by buttered rice pilaf if you wish.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!karnıyarıkRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(karnıyarıkRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String mantıSteps() {
            Queue<String> mantıRecipeSteps = new LinkedList<>();
            mantıRecipeSteps.offer("Pour 3 cups of flour into a kneading bowl, make a well in the middle, add 1 egg, 1 teaspoon of salt, and 1 cup of warm water and knead.");
            mantıRecipeSteps.offer("When you obtain a flexible dough that does not stick to the hand, cover it and leave it to rest.");
            mantıRecipeSteps.offer("For the filling, grate 1 onion. Add 250 grams of minced meat to the onion.");
            mantıRecipeSteps.offer("Then, add half a teaspoon of black pepper, a teaspoon of salt, and half a teaspoon of chili pepper and knead well.");
            mantıRecipeSteps.offer("Divide the dough into pieces.");
            mantıRecipeSteps.offer("Roll out each dough piece with a rolling pin, slightly thicker than ready-made phyllo dough.");
            mantıRecipeSteps.offer("Cut the rolled dough into squares.");
            mantıRecipeSteps.offer("Place a small piece of the minced meat mixture in the middle of each square. Close it in a bundle shape.");
            mantıRecipeSteps.offer("Add water to a deep pot, bring it to a boil, and cook the mantı for about 20 minutes.");
            mantıRecipeSteps.offer("For the sauce, melt 2 tablespoons of butter in a bowl.");
            mantıRecipeSteps.offer("Add 2 tablespoons of tomato paste to the melted butter and fry.");
            mantıRecipeSteps.offer("Add the water from the cooked mantı and the tomato paste and boil for a few minutes.");
            mantıRecipeSteps.offer("After draining the mantı and placing it on a serving plate, pour 1 bowl of garlic yogurt over it.");
            mantıRecipeSteps.offer("After pouring the prepared sauce over it, you can serve it by adding 1 teaspoon of dried mint, half a teaspoon of sumac, and 1 teaspoon of chili pepper.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!mantıRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(mantıRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String whiteBeanStewWithMeatSteps() {
            Queue<String> whiteBeanStewRecipeSteps = new LinkedList<>();
            whiteBeanStewRecipeSteps.offer("Place 1.5 cups of dried beans in hot water and soak them overnight.");
            whiteBeanStewRecipeSteps.offer("Chop 1 onion and fry it with 5 tablespoons of oil in a pressure cooker.");
            whiteBeanStewRecipeSteps.offer("Add 300 grams of diced meat and fry lightly. At this stage, the meat will release and absorb its water.");
            whiteBeanStewRecipeSteps.offer("After adding 1 tablespoon of pepper paste, 1 tablespoon of tomato paste, 1 teaspoon of salt, 1 teaspoon of chili pepper, add the drained beans.");
            whiteBeanStewRecipeSteps.offer("Add enough hot water to cover it and close the pressure cooker lid.");
            whiteBeanStewRecipeSteps.offer("Once it boils, reduce the heat to low and cook for 30-40 minutes. Your meal is ready.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!whiteBeanStewRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(whiteBeanStewRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String patlıcanOturtmaSteps() {
            Queue<String> patlıcanOturtmaRecipeSteps = new LinkedList<>();
            patlıcanOturtmaRecipeSteps.offer("Cut 3 large eggplants into thick rings, soak them in salt water, then fry both sides.");
            patlıcanOturtmaRecipeSteps.offer("Then, lightly sauté 3-4 tablespoons of oil, 1 onion, and 2 chopped peppers in the pan.");
            patlıcanOturtmaRecipeSteps.offer("Add 200 grams of minced meat and fry until the minced meat is completely tender.");
            patlıcanOturtmaRecipeSteps.offer("Finally, add 2 grated tomatoes, 1-2 cloves of garlic, and 1 teaspoon of all the spices, stir and fry until the water is absorbed.");
            patlıcanOturtmaRecipeSteps.offer("Just before removing it from the stove, add the chopped parsley, stir, and remove from the stove.");
            patlıcanOturtmaRecipeSteps.offer("Fill the middle of the fried eggplants with stuffing.");
            patlıcanOturtmaRecipeSteps.offer("After all the eggplants are stuffed, make a sauce with 2 tablespoons of tomato paste and 3 glasses of water and put them in the oven.");
            patlıcanOturtmaRecipeSteps.offer("You can bake it in the oven at 200 degrees.");
            patlıcanOturtmaRecipeSteps.offer("If you wish, you can put cheddar on top, let it melt, and serve when it is about to come out of the oven.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!patlıcanOturtmaRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(patlıcanOturtmaRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String sauteedMeatSteps() {
            Queue<String> sauteedMeatRecipeSteps = new LinkedList<>();
            sauteedMeatRecipeSteps.offer("First, add 3 tablespoons of oil and 1 tablespoon of butter to the pan.");
            sauteedMeatRecipeSteps.offer("Then add 1 chopped onion. Start roasting.");
            sauteedMeatRecipeSteps.offer("Add 2 chopped capias and 2 chopped green peppers and continue roasting.");
            sauteedMeatRecipeSteps.offer("Add 400 grams of cubed beef on top and continue mixing.");
            sauteedMeatRecipeSteps.offer("Add 2 chopped tomatoes on top.");
            sauteedMeatRecipeSteps.offer("Add 2 teaspoons of salt, half a teaspoon of black pepper, half a teaspoon of cumin, 1 teaspoon of thyme, and 1 teaspoon of chili pepper.");
            sauteedMeatRecipeSteps.offer("Add 1 tablespoon of pepper paste.");
            sauteedMeatRecipeSteps.offer("Keep it on high heat until the tomatoes release their juices.");
            sauteedMeatRecipeSteps.offer("Then cook over low heat until it brews. Your meal is ready.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!sauteedMeatRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(sauteedMeatRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        // ÇORBALAR


        public static String broccoliSoupSteps() {
            Queue<String> broccoliSoupRecipeSteps = new LinkedList<>();
            broccoliSoupRecipeSteps.offer("Boil 500 grams of broccoli, cut into small pieces, with 7 glasses of water.");
            broccoliSoupRecipeSteps.offer("After boiling the broccoli, remove it with a colander and set the water aside.");
            broccoliSoupRecipeSteps.offer("Melt 1 tablespoon of olive oil and 1 tablespoon of butter in a deep pot.");
            broccoliSoupRecipeSteps.offer("Add 1 tablespoon of flour and fry until its smell disappears and it turns a light color.");
            broccoliSoupRecipeSteps.offer("Gradually add the reserved water from boiled broccoli to the roasted flour, stirring constantly with a whisk to avoid lumps.");
            broccoliSoupRecipeSteps.offer("After boiling for 2-3 minutes, add the boiled and drained broccoli into the reserved water.");
            broccoliSoupRecipeSteps.offer("Blend the soup with a hand blender to get a smooth consistency.");
            broccoliSoupRecipeSteps.offer("Finally, add 1.5 teaspoons of salt and half a teaspoon of black pepper and mix well.");
            broccoliSoupRecipeSteps.offer("Bring the broccoli soup to a boil, then turn off the heat and serve hot.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!broccoliSoupRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(broccoliSoupRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String tarhanaSoupSteps() {
            Queue<String> tarhanaSoupRecipeSteps = new LinkedList<>();
            tarhanaSoupRecipeSteps.offer("Keep 3 tablespoons of tarhana in a bowl with 1 glass of water for half an hour, then crush.");
            tarhanaSoupRecipeSteps.offer("Add 2 tablespoons of oil to the pot and roast 1 tablespoon of tomato paste until its smell disappears.");
            tarhanaSoupRecipeSteps.offer("Add 1 teaspoon of mint and 5 more glasses of water to the soaked tarhana mixture.");
            tarhanaSoupRecipeSteps.offer("Add 1 teaspoon of salt and boil, stirring constantly, until it thickens. The soup is ready.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!tarhanaSoupRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(tarhanaSoupRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String ezogelinSoupSteps() {
            Queue<String> ezogelinSoupRecipeSteps = new LinkedList<>();
            ezogelinSoupRecipeSteps.offer("Bring hot water to a boil in a large pot. Transfer 2 tea glasses of washed and drained red lentils into the pot.");
            ezogelinSoupRecipeSteps.offer("Transfer 3 tablespoons of rice, 2 tablespoons of bulgur, and 1 teaspoon of salt into the pot.");
            ezogelinSoupRecipeSteps.offer("Cook for about 35 minutes, until the red lentils are soft.");
            ezogelinSoupRecipeSteps.offer("Melt 1 tablespoon of butter in a separate pan.");
            ezogelinSoupRecipeSteps.offer("Add 1 diced onion and start roasting.");
            ezogelinSoupRecipeSteps.offer("Add 1 teaspoon of tomato paste to the roasted onions.");
            ezogelinSoupRecipeSteps.offer("Add 1 teaspoon of mint and fry for 2 more minutes.");
            ezogelinSoupRecipeSteps.offer("Remove the roasted sauce from the stove.");
            ezogelinSoupRecipeSteps.offer("Add the roasted tomato paste and onion mixture to the pot in which you boiled the legumes.");
            ezogelinSoupRecipeSteps.offer("Quickly stir the soup and cook for another 10 minutes. Your soup is ready.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!ezogelinSoupRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(ezogelinSoupRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String lentilSoupSteps() {
            Queue<String> lentilSoupRecipeSteps = new LinkedList<>();
            lentilSoupRecipeSteps.offer("Rinse 1 cup of red lentils thoroughly under cold water.");
            lentilSoupRecipeSteps.offer("In a large pot, heat 2 tablespoons of sunflower oil over medium heat.");
            lentilSoupRecipeSteps.offer("Add 1 chopped onion and cook until it becomes translucent, about 5 minutes.");
            lentilSoupRecipeSteps.offer("Stir in 2 cloves of minced garlic and cook for another minute.");
            lentilSoupRecipeSteps.offer("Add 2 chopped carrots and cook for 5 minutes.");
            lentilSoupRecipeSteps.offer("Pour in 4 cups of vegetable broth and bring to a boil.");
            lentilSoupRecipeSteps.offer("Add the rinsed lentils to the pot and reduce the heat to low. Simmer for 20-25 minutes until the lentils are tender.");
            lentilSoupRecipeSteps.offer("Season with salt and pepper to taste.");
            lentilSoupRecipeSteps.offer("Serve hot, optionally garnished with fresh parsley.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!lentilSoupRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(lentilSoupRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }

        public static String yoghurtSoupSteps() {
            Queue<String> yoghurtSoupRecipeSteps = new LinkedList<>();
            yoghurtSoupRecipeSteps.offer("Heat 2 tablespoons of olive oil in a large pot over medium heat.");
            yoghurtSoupRecipeSteps.offer("Add 1 chopped onion and cook until softened, about 5 minutes.");
            yoghurtSoupRecipeSteps.offer("Stir in 2 cloves of minced garlic and cook for 1 minute.");
            yoghurtSoupRecipeSteps.offer("Add 2 tablespoons of flour and cook, stirring constantly, for 1-2 minutes.");
            yoghurtSoupRecipeSteps.offer("Gradually whisk in 6 cups of water until smooth.");
            yoghurtSoupRecipeSteps.offer("Add 1 cup of long-grain rice and bring to a boil.");
            yoghurtSoupRecipeSteps.offer("Reduce heat to low, cover, and simmer until rice is tender, about 15-20 minutes.");
            yoghurtSoupRecipeSteps.offer("In a small bowl, whisk together 1 cup of plain yogurt and 2 egg yolks until smooth.");
            yoghurtSoupRecipeSteps.offer("Slowly whisk in 1 cup of hot soup mixture into the yogurt mixture.");
            yoghurtSoupRecipeSteps.offer("Pour the yogurt mixture back into the soup pot and stir well.");
            yoghurtSoupRecipeSteps.offer("Season with salt and pepper to taste.");
            yoghurtSoupRecipeSteps.offer("Serve hot, optionally garnished with dried mint.");

            StringBuilder steps = new StringBuilder();
            int stepNumber = 1;
            while (!yoghurtSoupRecipeSteps.isEmpty()) {
                steps.append("Step ").append(stepNumber).append(": ").append(yoghurtSoupRecipeSteps.poll()).append("\n");
                stepNumber++;
            }
            return steps.toString();
        }
    }