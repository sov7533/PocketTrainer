<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Sentra - Free Bootstrap Template</title>

    <!--   Sentra Template https://templatemo.com/tm-518-sentra    -->
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">

    <link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/fontAwesome.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/light-box.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/owl-carousel.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/templatemo-style.css">

    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

    <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>

    <script>

    </script>
</head>

<body>


<header class="nav-down responsive-nav hidden-lg hidden-md">
    <button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
    </button>
</header>

<div class="sidebar-navigation hidde-sm hidden-xs">
    <div class="logo">
        <a href="/"><em>Pocket</em>Trainer</a>
    </div>
    <nav>
        <ul>
            <c:forEach items="${traininginfo}" var="item">
                <li>
                    <a href="/newsDisable/${item.trhead}">
                        <span class="rect"></span>
                        <span class="circle"></span>
                            ${item.trhead}
                    </a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</div>

<div class="sidebar-navigation-right hidde-sm hidden-xs">
</div>
<%--<div class="slider">--%>
<%--<div class="Modern-Slider content-section" id="top">--%>
<%--<c:if test="${newsEnable}">--%>
<%--<c:forEach items="${news}" var="item">--%>
<%--<div class="item item-1">--%>

<%--<h1>${item.head}</h1>--%>
<%--${item.body}--%>
<%--&lt;%&ndash;<div class="image"></div>&ndash;%&gt;--%>
<%--&lt;%&ndash;<div class="info">&ndash;%&gt;--%>
<%--&lt;%&ndash;<div>&ndash;%&gt;--%>
<%--&lt;%&ndash;<h1>Beautiful Template<br>Sentra</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;<p>Sentra is free Bootstrap CSS template by&ndash;%&gt;--%>
<%--&lt;%&ndash;<a rel="nofollow noopener" href="https://templatemo.com">templatemo</a> website.<br>&ndash;%&gt;--%>
<%--&lt;%&ndash;Please share our site to your friends.</p>&ndash;%&gt;--%>
<%--&lt;%&ndash;<div class="white-button button">&ndash;%&gt;--%>
<%--&lt;%&ndash;<a href="#featured">Discover More</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
<%--&lt;%&ndash;</div>&ndash;%&gt;--%>
<%--</div>--%>
<%--</c:forEach>--%>
<%--</c:if>--%>
<%--<c:if test="${not newsEnable}">--%>
<%--<div class="item item-1">--%>
<%--${trbody}--%>
<%--</div>--%>
<%--</c:if>--%>
<%--</div>--%>
<%--</div>--%>


<div class="page-content">
    <%--</section>--%>
    <c:if test="${newsEnable}">
        <c:forEach items="${news}" var="item">
            <section id="projects" class="content-section">
                <div class="section-heading">
                    <h1><em> ${item.head}</em></h1>

                </div>
                <div class="section-content">
                    <p> ${item.body}</p>
                        <%--<div class="masonry">--%>
                        <%--<div class="row">--%>
                        <%--<div class="item">--%>
                        <%--<div class="col-md-8">--%>
                        <%--<a href="img/portfolio_big_1.jpg" data-lightbox="image">--%>
                        <%--<img src="img/portfolio_1.jpg" alt="image 1"></a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="item second-item">--%>
                        <%--<div class="col-md-4">--%>
                        <%--<a href="img/portfolio_big_2.jpg" data-lightbox="image">--%>
                        <%--<img src="img/portfolio_2.jpg" alt="image 2"></a>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                        <%--</div>--%>
                </div>
            </section>
        </c:forEach>
    </c:if>
    <c:if test="${not newsEnable}">
        <section id="projects" class="content-section">
            <div class="section-heading">
                <h1><em> ${trhead}</em></h1>
            </div>
            <div class="section-content">
                <p> ${trbody}</p>
            </div>
        </section>
    </c:if>

    <%--<section id="video" class="content-section">--%>
    <%--<div class="row">--%>
    <%--<div class="col-md-12">--%>
    <%--<div class="section-heading">--%>
    <%--<h1>This is a <em>project</em> presentation.</h1>--%>
    <%--<p>Praesent pellentesque efficitur magna, sed pellentesque neque malesuada vitae.</p>--%>
    <%--</div>--%>
    <%--<div class="text-content">--%>
    <%--<p>In eget ipsum sed lorem vehicula luctus. Curabitur non dolor rhoncus, hendrerit justo sit amet, vestibulum turpis. Pellentesque id auctor tellus, vel ultricies augue. Duis condimentum aliquet blandit. Fusce rhoncus et eros ut pharetra. Phasellus convallis ultricies ligula ac gravida.</p>--%>
    <%--</div>--%>
    <%--<div class="accent-button button">--%>
    <%--<a href="#blog">Continue Reading</a>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<div class="col-md-12">--%>
    <%--<div class="box-video">--%>
    <%--<div class="bg-video" style="background-image: url(https://unsplash.imgix.net/photo-1425036458755-dc303a604201?fit=crop&fm=jpg&q=75&w=1000);">--%>
    <%--<div class="bt-play">Play</div>--%>
    <%--</div>--%>
    <%--<div class="video-container">--%>
    <%--<iframe width="100%" height="520" src="https://www.youtube.com/embed/j-_7Ub-Zkow?rel=0&amp;showinfo=0" frameborder="0" allowfullscreen="allowfullscreen"></iframe>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</section>--%>
    <section class="footer">
        <p>Copyright &copy; 2019 PocetTrainer
            <%--<a rel="nofollow noopener" href="https://templatemo.com/tm-518-sentra"--%>
            <%--title="Sentra by templatemo">Sentra</a></p>p--%>
    </section>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

<%--<script src="js/vendor/bootstrap.min.js"></script>--%>
<%----%>
<%--<script src="js/plugins.js"></script>--%>
<%--<script src="js/main.js"></script>--%>

</body>
</html>