(defproject lein-figwheel "0.5.4-2"
  :description "ClojureScript Autobuilder/Server which pushes changed files to the browser. This is the lein plugin."
  :url "https://github.com/bhauman/lein-figwheel"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[simple-lein-profile-merge "0.1.1"]]

  :scm { :name "git"
         :url "https://github.com/bhauman/lein-figwheel"
         :dir ".."}

  :profiles {:dev {:dependencies [[leiningen-core "2.6.1"]]
                   :source-paths ["dev"]
                   :aliases {"change-version" ["run" "-m" "figwheel-tasks.core" ":change-version"]
                             "install-all"    ["run" "-m" "figwheel-tasks.core" ":install-all"]}}}
  
  :eval-in-leiningen true)
