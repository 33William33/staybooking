const domain = "";

export const login = (credential) => {
  const loginUrl = `${domain}/auth/login`;
  const requestStatus = fetch(loginUrl, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(credential),
  });
  requestStatus.then((response) => {
    if (response.status >= 300) {
      throw Error("Fail to log in");
    }
    return response.json();
  });
};
