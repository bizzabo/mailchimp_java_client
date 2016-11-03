## mailchimp_java_client
Java client for Mailchimp V3
(WIP - partial apis for lists and batch operations)

# Usage:

# setup the main Mailchimp client using endpoint url and the api token:
```java
Mailchimp mailchimp = new Mailchimp(instanceUrl, token);
```
# execute calls to a resource: (example of lists resource)
```java
Map<String,Object> params = new HashMap<>();
params.put("count", 1000);
mailchimp.lists().get(params);
```
# get Interests example:
```java
Map<String,Object> params = new HashMap<>();
params.put("count", 1000);
return mailchimp.lists().getInterests(listId, categoryId,params);
```





