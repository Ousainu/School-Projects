<?php
    //connecting to the database
    $server = "localhost";
    $user = "root";
    $password="";
    $databaseName = "momadb";
    $database_table = "momadb_table";
    
    $conn = mysqli_connect($server,$user,$password) or die("No connection");
    
    //selecting the database
    $selectDB = mysqli_select_db($conn,$databaseName) or die("No selection");
   
   //creating SQL select string command
   $SQLselect = "select * from $database_table";
   
   //running the $SQLselect
    $result = mysqli_query($conn,$SQLselect) or die ("SQLselect did not run");
    
    $dataout = "";
    
    while ($row = mysqli_fetch_array($result))
    {
        $unitPrice = $row["unit_price"];
        
        $dataout .=$unitPrice." ";
    }
    print ($dataout);


?>