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
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
    <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
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
        <%--<title>Log in with your account</title>--%>
        <%--<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">--%>
        <%--<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>--%>
        <%--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>

    <div class="log-in">
        <form method="POST" action="${contextPath}/login" class="form-signin">
            <h2 class="form-heading">Log in</h2>
            <div class="form-group ${error != null ? 'has-error' : ''}">
                <span>${message}</span>
                <input name="username" type="text" class="form-control" placeholder="Username"
                       autofocus="true"/>
                <input name="password" type="password" class="form-control" placeholder="Password"/>
                <span>${error}</span>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button class="log-in-button btn btn-lg btn-primary btn-block" type="submit">Log In</button>
                <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
            </div>
        </form>
    </div>
</div>

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

    <section class="footer">
        <p>Copyright &copy; 2019 PocetTrainer
            <%--<a rel="nofollow noopener" href="https://templatemo.com/tm-518-sentra"--%>
            <%--title="Sentra by templatemo">Sentra</a></p>p--%>
    </section>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

</body>
</html>