(defproject friend-auth "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [io.pedestal/pedestal.service "0.1.8"]
                 [com.cemerick/friend "0.1.6-SNAPSHOT"
                  :exclusions [ring/ring-core]]

                 ;; Remove this line and uncomment the next line to
                 ;; use Tomcat instead of Jetty:
                 [io.pedestal/pedestal.jetty "0.1.8"]
                 ;; [io.pedestal/pedestal.tomcat "0.1.8"]

                 ;; Logging
                 [ch.qos.logback/logback-classic "1.0.7"]
                 [org.slf4j/jul-to-slf4j "1.7.2"]
                 [org.slf4j/jcl-over-slf4j "1.7.2"]
                 [org.slf4j/log4j-over-slf4j "1.7.2"]]
  :profiles {:dev {:source-paths ["dev"]}}
  :resource-paths ["config" "resources"]
  :main ^{:skip-aot true} friend-auth.server)