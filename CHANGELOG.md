# Kubernetes Continuous Deploy Plugin Changelog

## Version 3.0.0, 2025-06-17
* **Security fix**: Resolved CVE-2021-25738 (SECURITY-2448) — remote code execution vulnerability via unsafe YAML deserialization
* **Breaking change**: Migrated from fabric8 Kubernetes Client to official `io.kubernetes:client-java` v26.0.0
* **Breaking change**: Minimum Jenkins version bumped to **2.555.1**
* **Breaking change**: Minimum Java version bumped to **21**
* **Breaking change**: Removed support for legacy Kubernetes API versions (`extensions/v1beta1`, `apps/v1beta1`, `apps/v1beta2`)
* Removed deprecated credential types: `ConfigFileCredentials`, `TextCredentials`, `SSHCredentials`
* Upgraded resource API versions:
  - DaemonSet → apps/v1
  - Deployment → apps/v1
  - ReplicaSet → apps/v1
  - Ingress → networking.k8s.io/v1
  - CronJob → batch/v1
  - HPA → autoscaling/v1, autoscaling/v2
* Updated build to Java 21 and Maven 3.9+
* Various dependency upgrades and code improvements

## Version 2.3.1, 2020-10-27
* Bump guava from 20.0 to 24.1.1-jre
* Update maintainer

## Version 2.3.0, 2020-01-09
* Add rbac resource、networking ingress support
* Fix PVC cannot be applyed after PVC is bound

## Version 2.2.0, 2019-11-26
* Add credentials binding to save kubeconfig in file

## Version 2.1.2, 2019-08-29
* Fix ClassNotFoundException for jackson lib

## Version 2.1.1, 2019-08-27
* Enable cascading deletion by default to delete dependents

## Version 2.1.0, 2019-08-19
* Support deleting resources

## Version 2.0.1, 2019-08-14
* Init supported models when loading clientWrapper

## Version 2.0.0, 2019-08-07
* Change kubernetes sdk to the official one
* Make resources compatible with several api versions
* Support more resource types: StatefulSets, Network policy, Persistent Volume, Persistent Volume Claim
* Enable incremental builds for PRs

## Version 1.0.0, 2019-05-31
**This version forces updating Kubernetes yaml files' api version**
* Bump Jenkins version to 2.60.3
* Upgrade kubernetes-client sdk version to 4.0.4
* Add support for CronJob and HPA

## Version 0.2.3, 2018-06-08
* Documentation and AI fix

## Version 0.2.2, 2018-05-18
* Support for namespace creation and update
* Fix EnvironmentInjector serialization (JENKINS-51147)

## Version 0.2.1, 2018-04-20
* Fix scoped SSH credentials lookup in kubeconfig credentials (#26)
* Fix Kubernetes deploy configuration verification (#29)
* Add support for ConfigMap (#30)
* Fix serialization of 3rd party exceptions thrown from slave (JENKINS-50760)

## Version 0.2.0, 2018-04-03
* Configure kubeconfig in the Jenkins credentials store instead of the job configuration (JENKINS-49781)

   The original "Kubernetes Cluster Credentials" configuration is deprecated.
* Upgrade Kubernetes Client to 3.1.10
* Use scoped credentials lookup (#19)

## Version 0.1.5, 2018-02-22
* Abort build on error (JENKINS-48662 / #12)
* Update Kubernetes Client to 3.1.7

## Version 0.1.4, 2017-11-07
* Fix master node SSH password login on Jenkins slave
* Add Third Party Notice

## Version 0.1.3, 2017-10-10
* Remove EULA

## Version 0.1.2, 2017-09-29
* Fixed a stream closed issue when variable substitution is disabled

## Version 0.1.1, 2017-09-28
* Fixed an issue that plugin crashes on fastxml load

## Version 0.1.0, 2017-09-27
* Initial release
