# gwt-redux
GWT Java bindings for Redux and Redux related projects

##Introduction

gwt-redux provides Java [GWT](http://www.gwtproject.org/) bindings based on the
new JsInterop capabilities introduced in GWT 2.8 for the following Redux related projects:

* [redux 3.4.0](https://github.com/reactjs/redux)
* [react-redux 4.4.5](https://github.com/reactjs/react-redux)
* [redux-undo 1.0.0 beta](https://github.com/omnidan/redux-undo)

This project depends on [gwt-react](https://github.com/GWTReact/gwt-react)

***Please note: the project currently only works with a Snapshot build of GWT 2.8. Consider this project a preview. The API is only partially complete at this point and is highly likely to change.***

##Getting Started

Please take a look at the [gwt-react-examples](https://github.com/GWTReact/gwt-react-examples) project for
details on how to use the library.

You can download the latest release .jar from Maven Central using the following coordinates:

* **groupId**&nbsp;&nbsp;&nbsp; com.github.gwtreact
* **artifactId**&nbsp;&nbsp;gwt-redux
* **version**&nbsp;&nbsp;&nbsp;  0.2.0

##Roadmap

* Finish the API
* Provide API's for the popular middleware

##Change log

| Date | Version | Description |
| :---      | :---  | :---  |
| 6/18/2016 | 0.2.0 | Update to use gwt-interop-utils library   |
| 5/25/2016 | 0.1.1 | Fix incorrect inherits   |
| 5/13/2016 | 0.1.0 | Initial preview release to Maven Central   |
