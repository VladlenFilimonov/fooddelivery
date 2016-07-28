/**
 * Created by student007 on 16.25.7.
 */
var gulp = require('gulp');
var less = require('gulp-less');
var angularTemplateCache = require('gulp-angular-templatecache');
var concat = require('gulp-concat');

var jsFiles = [
    'bower_components/jquery/dist/jquery.js',
    'bower_components/angular/angular.js',
    'bower_components/angular-resource/angular-resource.js',
    'bower_components/angular-route/angular-route.js',
    'src_frontend/app/app.js',
    'src_frontend/app/config.js',
    'src_frontend/app/controllers/categoryController.js',
    'src_frontend/app/controllers/indexController.js',
    'src_frontend/app/services/categoryService.js',
    'src_frontend/app/views/templates.js'

];

gulp.task('less', function () {
    gulp.src('src_frontend/less/frontend/style.less')
        .pipe(less())
        .pipe(gulp.dest('application-api/src/main/resources/static/css'))
});

gulp.task('templates', function () {
    gulp.src('src_frontend/app/views/**/*.html')
        .pipe(angularTemplateCache({
            module: 'foodDeliveryApp',
            root: 'views'
        }))
        .pipe(gulp.dest('src_frontend/app/views'))
});

gulp.task('build', function () {
    gulp.src(jsFiles)
        .pipe(concat('app.js'))
        .pipe(gulp.dest('application-api/src/main/resources/static/js'))
});