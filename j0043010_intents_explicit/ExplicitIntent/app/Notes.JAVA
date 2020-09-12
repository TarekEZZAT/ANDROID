Intent i = new Intent(this,  ActivityB.class);
        i.putExtra("myString", "This is a message for ActivityB");
        i.putExtra("myInt", 100);

        startActivity(i);

//===================================================

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
        String myString = extras.getString("myString");
        int myInt = extras.getInt("myInt");
        }