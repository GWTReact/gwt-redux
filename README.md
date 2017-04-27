# gwt-redux
GWT Java bindings for Redux and Redux related projects

#PLEASE NOTE THIS PROJECT IS NOT CURRENTLY MAINTAINED

If you are interested in taking over maintenance, please file an issue and I can grant you commit permission

## Introduction

gwt-redux provides Java [GWT](http://www.gwtproject.org/) bindings based on the
new JsInterop capabilities introduced in GWT 2.8 for the following Redux related projects:

* [redux 3.5.2](https://github.com/reactjs/redux)
* [react-redux 4.4.5](https://github.com/reactjs/react-redux)
* [redux-undo 1.0.0 beta](https://github.com/omnidan/redux-undo)

This project depends on [gwt-react](https://github.com/GWTReact/gwt-react)

***The API is only partially complete at this point and is highly likely to change.***

## Getting Started

Please take a look at the examples directory for details on how to use the library.

You can download the latest release .jar from Maven Central using the following coordinates:

* **groupId**&nbsp;&nbsp;&nbsp; com.github.gwtreact
* **artifactId**&nbsp;&nbsp;gwt-redux
* **version**&nbsp;&nbsp;&nbsp;  0.4.0

## Roadmap

* Finish the API
* Provide API's for the popular middleware

## Change log

| Date | Version | Description |
| :---      | :---  | :---  |
| 3/18/2017 | 0.4.0 | Refactored to use more future proof ES6 styled stateful components and added Preact support   |
| 10/28/2016 | 0.3.0 | Support Redux 3.5.2 and GWT 2.8 final release   |
| 6/18/2016 | 0.2.0 | Update to use gwt-interop-utils library   |
| 5/25/2016 | 0.1.1 | Fix incorrect inherits   |
| 5/13/2016 | 0.1.0 | Initial preview release to Maven Central   |
